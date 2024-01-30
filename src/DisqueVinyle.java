import java.util.Date;

/**
 * Classe représentant un disque vinyle.
 */
public class DisqueVinyle extends Produit {
    private String artiste;
    private int anneeProduction;
    private boolean estCollector;
    private String etatConservation;

    /**
     * Constructeur de la classe DisqueVinyle.
     *
     * @param intitule           L'intitulé du disque vinyle.
     * @param codeBarre          Le code-barre du disque vinyle.
     * @param prix               Le prix du disque vinyle.
     * @param dateAcquisition    La date d'acquisition du disque vinyle.
     * @param artiste            L'artiste du disque vinyle.
     * @param anneeProduction    L'année de production du disque vinyle.
     * @param estCollector       Indique si le disque vinyle est un collector.
     * @param etatConservation   L'état de conservation du disque vinyle.
     */
    public DisqueVinyle(String intitule, String codeBarre, double prix, Date dateAcquisition, String artiste, int anneeProduction, boolean estCollector, String etatConservation) {
        super(intitule, codeBarre, prix, dateAcquisition);
        this.artiste = artiste;
        this.anneeProduction = anneeProduction;
        this.estCollector = estCollector;
        this.etatConservation = etatConservation;
    }

    /**
     * Obtient l'artiste du disque vinyle.
     *
     * @return L'artiste du disque vinyle.
     */
    public String getArtiste() {
        return artiste;
    }

    /**
     * Obtient l'année de production du disque vinyle.
     *
     * @return L'année de production du disque vinyle.
     */
    public int getAnneeProduction() {
        return anneeProduction;
    }

    /**
     * Indique si le disque vinyle est un collector.
     *
     * @return {@code true} si le disque vinyle est un collector, sinon {@code false}.
     */
    public boolean isEstCollector() {
        return estCollector;
    }

    /**
     * Obtient l'état de conservation du disque vinyle.
     *
     * @return L'état de conservation du disque vinyle.
     */
    public String getEtatConservation() {
        return etatConservation;
    }

    /**
     * Retourne une représentation textuelle du disque vinyle.
     *
     * @return Une chaîne de caractères représentant le disque vinyle.
     */
    @Override
    public String toString() {
        return super.toString() + " - Artiste: " + artiste + " - Année de production: " + anneeProduction +
                " - Collector: " + estCollector + " - État de conservation: " + etatConservation;
    }
}
