import java.util.ArrayList;
import java.util.List;

class Membre {

    //Champs privés
    private String nom;
    private int id;
    private List<Media> mediasEmpruntes;

    //Constructeur paramétré
    public Membre(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.mediasEmpruntes = new ArrayList<>();
    }
    //Méthodes get
    public String getNom() {
        return this.nom;
    }
    public int getId() {
        return this.id;
    }
    //Méthode emprunterMedia
    public void emprunterMedia(Media media) {
        this.mediasEmpruntes.add(media);
    }
    //Get liste des médias empruntés
    public List<Media> getMediasEmpruntes() {
        return this.mediasEmpruntes;
    }

    @Override
    public String toString() {
        return "Membre{nom='" + nom + "', id=" + id + "}";
    }
}
