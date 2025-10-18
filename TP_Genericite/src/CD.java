class CD extends Media implements Empruntable {
    //Champs privés
    private String artiste;
    private int duree;
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

    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    @Override
    public void emprunter() {
        System.out.println("CD emprunté : " + getTitre());
    }
}
