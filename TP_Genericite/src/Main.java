public class Main {
    public static void main(String[] args) {
        //Collections
        java.util.List<Media> mediasDisponibles = new java.util.ArrayList<>();
        java.util.Set<Membre> membres = new java.util.HashSet<>();
        java.util.Map<Membre, java.util.List<Media>> emprunts = new java.util.HashMap<>();

        // Création des médias
        Livre livre1 = new Livre("Livres_test_1", 2000, "Auteur_A", 70);
        Livre livre2 = new Livre("Livres_test_2", 2001, "Auteur_B", 80);
        Livre livre3 = new Livre("Livres_test_3", 2002, "Auteur_C", 90);
        CD cd1 = new CD("CD_test_1", 2003, "Artiste_A", 60);
        CD cd2 = new CD("CD_test_2", 2004, "Artiste_B", 45);

        mediasDisponibles.add(livre1);
        mediasDisponibles.add(livre2);
        mediasDisponibles.add(livre3);
        mediasDisponibles.add(cd1);
        mediasDisponibles.add(cd2);

        //Création des membres
        Membre membre1 = new Membre("Pierre", 1);
        Membre membre2 = new Membre("Paul", 2);
        Membre membre3 = new Membre("Jacques", 3);
        membres.add(membre1);
        membres.add(membre2);
        membres.add(membre3);

        //Emprunter
        membre1.emprunterMedia(livre1);
        membre1.emprunterMedia(cd1);
        membre2.emprunterMedia(livre2);
        membre3.emprunterMedia(cd2);

        emprunts.put(membre1, membre1.getMediasEmpruntes());
        emprunts.put(membre2, membre2.getMediasEmpruntes());
        emprunts.put(membre3, membre3.getMediasEmpruntes());

        //Affichage des collections
        System.out.println("=== Medias disponibles ===");
        afficherListe(mediasDisponibles);

        System.out.println("\n=== Membres ===");
        afficherListe(new java.util.ArrayList<>(membres));

        System.out.println("\n=== Emprunts par membre ===");
        for (Membre membre : membres) {
            System.out.println(membre.getNom() + " a emprunte : ");
            afficherListe(membre.getMediasEmpruntes());
        }

        //Tests de filtrage
        System.out.println("\n=== Medias publiés apres 2002 ===");
        java.util.List<Media> mediasRecents = filtrerMediasParAnnee(mediasDisponibles, 2002);
        afficherListe(mediasRecents);

        System.out.println("\n=== Membres dont le nom commence par A ===");
        java.util.List<Membre> membresA = filtrerMembresParLettre(new java.util.ArrayList<>(membres), "A");
        afficherListe(membresA);

        //Tri simple
        System.out.println("\n=== Medias triés par annee (decroissant) ===");
        java.util.List<Media> mediasTries = new java.util.ArrayList<>(mediasDisponibles);
        trierMediasParAnnee(mediasTries);
        afficherListe(mediasTries);

        System.out.println("\n=== Livres tries par auteur ===");
        java.util.List<Livre> livres = new java.util.ArrayList<>();
        livres.add(new Livre("Nvx_livre_4", 2020, "Auteur_D", 100));
        livres.add(new Livre("Nvx_livre_5", 2021, "Auteur_E", 110));
        livres.add(new Livre("Nvx_livre_6", 2022, "Auteur_F", 120));
        trierLivresParAuteur(livres);
        afficherListe(livres);

        //Défis avancés
        System.out.println("\n=== Test copie collection ===");
        java.util.List<Media> copie = new java.util.ArrayList<>();
        copierCollection(mediasDisponibles, copie);
        System.out.println("Collection copiee (" + copie.size() + " elements)");

        System.out.println("\n=== Medias empruntés sans doublons ===");
        java.util.Set<Media> mediasEmpruntes = getMediasEmpruntes(emprunts);
        afficherListe(new java.util.ArrayList<>(mediasEmpruntes));

        System.out.println("\n=== Seulement les livres ===");
        java.util.List<Media> seulementLivres = filtrerSeulementLivres(mediasDisponibles);
        afficherListe(seulementLivres);

        //Test polymorphisme
        System.out.println("\n=== Test polymorphisme avec afficherDetails ===");
        for (Media media : mediasDisponibles) {
            media.afficherDetails();
        }
    }

    //Méthode générique pour afficher
    public static <T> void afficherListe(java.util.List<T> liste) {
        for (T element : liste) {
            System.out.println("- " + element);
        }
    }

    //Méthodes de filtrage simples
    public static java.util.List<Media> filtrerMediasParAnnee(java.util.List<Media> liste, int anneeMin) {
        java.util.List<Media> resultat = new java.util.ArrayList<>();
        for (Media media : liste) {
            if (media.getAnneePublication() > anneeMin) {
                resultat.add(media);
            }
        }
        return resultat;
    }

    public static java.util.List<Membre> filtrerMembresParLettre(java.util.List<Membre> liste, String lettre) {
        java.util.List<Membre> resultat = new java.util.ArrayList<>();
        for (Membre membre : liste) {
            if (membre.getNom().startsWith(lettre)) {
                resultat.add(membre);
            }
        }
        return resultat;
    }

    public static java.util.List<Media> filtrerSeulementLivres(java.util.List<Media> liste) {
        java.util.List<Media> resultat = new java.util.ArrayList<>();
        for (Media media : liste) {
            if (media instanceof Livre) {
                resultat.add(media);
            }
        }
        return resultat;
    }

    //Méthodes de tri simples
    public static void trierMediasParAnnee(java.util.List<Media> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            for (int j = 0; j < liste.size() - 1 - i; j++) {
                if (liste.get(j).getAnneePublication() < liste.get(j + 1).getAnneePublication()) {
                    Media temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
    }

    public static void trierLivresParAuteur(java.util.List<Livre> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            for (int j = 0; j < liste.size() - 1 - i; j++) {
                if (liste.get(j).getAuteur().compareTo(liste.get(j + 1).getAuteur()) > 0) {
                    Livre temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
    }

    //Méthode générique de copie
    public static <T> void copierCollection(java.util.Collection<T> source, java.util.Collection<T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }

    public static java.util.Set<Media> getMediasEmpruntes(java.util.Map<Membre, java.util.List<Media>> emprunts) {
        java.util.Set<Media> mediasEmpruntes = new java.util.HashSet<>();
        for (java.util.List<Media> medias : emprunts.values()) {
            for (Media media : medias) {
                mediasEmpruntes.add(media);
            }
        }
        return mediasEmpruntes;
    }
}
