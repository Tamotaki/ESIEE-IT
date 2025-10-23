import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un membre de la bibliothèque.
 * Un membre peut emprunter des médias.
 */
class Membre {

    //Champs privés
    private String nom;
    private int id;
    private List<Media> mediasEmpruntes;

    /**
     * Constructeur paramétré pour créer un membre.
     * 
     * @param nom Le nom du membre
     * @param id L'identifiant unique du membre
     */
    public Membre(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.mediasEmpruntes = new ArrayList<>();
    }
    /**
     * Retourne le nom du membre.
     * 
     * @return Le nom
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Retourne l'identifiant du membre.
     * 
     * @return L'identifiant
     */
    public int getId() {
        return this.id;
    }
    /**
     * Permet au membre d'emprunter un média.
     * 
     * @param media Le média à emprunter
     */
    public void emprunterMedia(Media media) {
        this.mediasEmpruntes.add(media);
    }
    /**
     * Retourne la liste des médias empruntés par ce membre.
     * 
     * @return La liste des médias empruntés
     */
    public List<Media> getMediasEmpruntes() {
        return this.mediasEmpruntes;
    }

    /**
     * Retourne une représentation textuelle du membre.
     * 
     * @return Chaîne au format "Membre{nom='[nom]', id=[id]}"
     */
    @Override
    public String toString() {
        return "Membre{nom='" + nom + "', id=" + id + "}";
    }
}
