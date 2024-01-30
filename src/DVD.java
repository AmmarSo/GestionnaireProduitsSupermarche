import java.util.Date;

/**
 * Classe représentant un DVD.
 */
public class DVD extends Produit {
    private String realisateur;
    private int dureeMinutes;

    /**
     * Constructeur de la classe DVD.
     *
     * @param intitule         L'intitulé du DVD.
     * @param codeBarre        Le code-barre du DVD.
     * @param prix             Le prix du DVD.
     * @param dateAcquisition  La date d'acquisition du DVD.
     * @param realisateur      Le réalisateur du DVD.
     * @param dureeMinutes     La durée du DVD en minutes.
     */
    public DVD(String intitule, String codeBarre, double prix, Date dateAcquisition, String realisateur, int dureeMinutes) {
        super(intitule, codeBarre, prix, dateAcquisition);
        this.realisateur = realisateur;
        this.dureeMinutes = dureeMinutes;
    }

    /**
     * Obtient le réalisateur du DVD.
     *
     * @return Le réalisateur du DVD.
     */
    public String getRealisateur() {
        return realisateur;
    }

    /**
     * Obtient la durée du DVD en minutes.
     *
     * @return La durée du DVD en minutes.
     */
    public int getDureeMinutes() {
        return dureeMinutes;
    }

    /**
     * Retourne une représentation textuelle du DVD.
     *
     * @return Une chaîne de caractères représentant le DVD.
     */
    @Override
    public String toString() {
        return super.toString() + " - Réalisateur: " + realisateur + " - Durée: " + dureeMinutes + " minutes";
    }
}
