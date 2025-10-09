import java.util.List;

class Membre {

    //Champs privés
    private String nom;
    private int id;
    private List<Media> mediasEmpruntes;

    //Constructeur paramétré
    public Membre(String nom, int id)

        //Methodes
    public void getNom()
    {
        this.nom = nom;
    }
    public void getId()
    {
        this.id = id;
    }
public void emprunterMedia(List<Media> mediasEmpruntes)

    @Override public String toString()
    {
        return "Membre {nom,id}";
    }
    //Collections

}
