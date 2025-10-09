class Livre extends Media {
    //Champs privés
    private String auteur;
    private int nbPages;

    //Construteur paramétré
public Livre(String titre, int anneePublication, String auteur, int nbPages) {}

    //Redéfinition
    @Override public String getDescription() {return "Livre de <auteur>, <nbPages> pages";}

}
