import java.util.Date;

/**
 * Classe abstraite représentant un produit générique.
 */
public abstract class Produit {
    private String intitule;
    private String codeBarre;
    private double prix;
    private Date dateAcquisition;

    /**
     * Constructeur de la classe Produit.
     *
     * @param intitule         L'intitulé du produit.
     * @param codeBarre        Le code-barre du produit.
     * @param prix             Le prix du produit.
     * @param dateAcquisition  La date d'acquisition du produit.
     */
    public Produit(String intitule, String codeBarre, double prix, Date dateAcquisition) {
        this.intitule = intitule;
        // Vérification du code barre
        if (codeBarre.matches("\\d{8}")) {
            this.codeBarre = codeBarre;
        } else {
            throw new IllegalArgumentException("Le code barre doit avoir exactement 8 chiffres.");
        }
        this.prix = prix;
        this.dateAcquisition = dateAcquisition;
    }

    /**
     * Obtient l'intitulé du produit.
     *
     * @return L'intitulé du produit.
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Obtient le prix du produit.
     *
     * @return Le prix du produit.
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Obtient la date d'acquisition du produit.
     *
     * @return La date d'acquisition du produit.
     */
    public Date getDateAcquisition() {
        return dateAcquisition;
    }

    /**
     * Retourne une représentation textuelle du produit.
     *
     * @return Une chaîne de caractères représentant le produit.
     */
    @Override
    public String toString() {
        return intitule + " - Code barre: " + codeBarre + " - Prix: " + prix + " - Date d'acquisition: " + dateAcquisition;
    }
}
