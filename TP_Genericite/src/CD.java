/**
 * Classe représentant un CD.
 * Hérite de Media et implémente Empruntable.
 */
class CD extends Media implements Empruntable {
    //Champs privés
    private String artiste;
    private int duree;
    /**
     * Constructeur paramétré pour créer un CD.
     * 
     * @param titre Le titre du CD
     * @param anneePublication L'année de publication
     * @param artiste L'artiste du CD
     * @param duree La durée en minutes
     * @throws IllegalArgumentException Si l'artiste est vide ou la durée négative
     */
    public CD(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        if (artiste == null || artiste.trim().isEmpty()) {
            throw new IllegalArgumentException("L'artiste ne peut pas être vide");
        }
        if (duree <= 0) {
            throw new IllegalArgumentException("La durée doit être positive");
        }
        this.artiste = artiste;
        this.duree = duree;
    }

    /**
     * Retourne la description du CD.
     * 
     * @return Description au format "CD de [artiste], durée : [duree] min."
     */
    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    /**
     * Implémentation de la méthode emprunter pour les CDs.
     */
    @Override
    public void emprunter() {
        System.out.println("CD emprunté : " + getTitre());
    }
}
