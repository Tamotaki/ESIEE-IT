class CD extends Media{
    //Champs privés
    private String artiste;
    private int duree; //En minutes

    //Constructeur paramétré
    public CD(String titre, int anneePublication,String artiste, int duree)

        //Redéfinition
    @Override
    public String getDescription() {
        return "D de <artiste>, durée : <duree> min.";
    }
}
