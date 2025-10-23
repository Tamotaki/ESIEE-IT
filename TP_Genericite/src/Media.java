/**
 * Classe abstraite représentant un média générique.
 * Classe mère pour tous les types de médias (Livre, CD, etc.).
 */
abstract class Media {
    private String titre;
    private int anneePublication;
    /**
     * Constructeur par défaut.
     */
    public Media() {}
    /**
     * Constructeur paramétré.
     * 
     * @param titre Le titre du média
     * @param anneePublication L'année de publication
     */
    public Media(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    /**
     * Retourne le titre du média.
     * 
     * @return Le titre
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Retourne l'année de publication du média.
     * 
     * @return L'année de publication
     */
    public int getAnneePublication() {
        return anneePublication;
    }
    /**
     * Méthode abstraite pour obtenir la description du média.
     * 
     * @return La description du média
     */
    public abstract String getDescription();
    /**
     * Affiche les détails du média en utilisant getDescription().
     * Démontre le polymorphisme.
     */
    public void afficherDetails() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return titre + " (" + anneePublication + ")";
    }
}
