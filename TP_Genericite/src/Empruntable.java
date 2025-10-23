/**
 * Interface définissant le comportement d'un objet empruntable.
 * Les classes implémentant cette interface peuvent être empruntées.
 */
interface Empruntable {
    /**
     * Méthode pour emprunter l'objet.
     * Chaque classe implémentant cette interface définit son propre comportement.
     */
    void emprunter();
}