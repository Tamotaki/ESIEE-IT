/**
 * Classe représentant un livre.
 * Hérite de Media et implémente Empruntable.
 */
class Livre extends Media implements Empruntable {
    private String auteur;
    private int nbPages;
    /**
     * Constructeur paramétré pour créer un livre.
     * 
     * @param titre Le titre du livre
     * @param anneePublication L'année de publication
     * @param auteur L'auteur du livre
     * @param nbPages Le nombre de pages
     */
    public Livre(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    /**
     * Retourne l'auteur du livre.
     * 
     * @return L'auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Retourne la description du livre.
     * 
     * @return Description au format "Livre de [auteur], [nbPages] pages"
     */
    @Override
    public String getDescription() {
        return "Livre de " + auteur + ", " + nbPages + " pages";
    }
    /**
     * Implémentation de la méthode emprunter pour les livres.
     */
    @Override
    public void emprunter() {
        System.out.println("Livre emprunté : " + getTitre());
    }
}
