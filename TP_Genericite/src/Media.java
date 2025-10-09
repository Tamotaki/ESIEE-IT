abstract class Media {
    //Champs privés
    private String titre;
    private int anneePublication;

    //Constructeur par défaut
    public Media () {}

    //Contructeur paramétré
    public Media(String titre, int anneePublication) {}
this.titre = titre
    this.anneePublication = anneePublication

    //Methodes
    public void getTitre() {);}
    public void getAnneePublication() {);}
    public abstract String getDescription();

    @Override public String toString() {System.out.println(titre(anneePublication));}
}
