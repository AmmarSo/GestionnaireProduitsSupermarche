import java.util.Date;

/**
 * Classe représentant un produit laitier.
 */
public class ProduitLaitier extends Produit {
    private String conservation;

    /**
     * Constructeur de la classe ProduitLaitier.
     *
     * @param intitule         L'intitulé du produit.
     * @param codeBarre        Le code-barre du produit.
     * @param prix             Le prix du produit.
     * @param dateAcquisition  La date d'acquisition du produit.
     * @param conservation     La méthode de conservation du produit laitier.
     */
    public ProduitLaitier(String intitule, String codeBarre, double prix, Date dateAcquisition, String conservation) {
        super(intitule, codeBarre, prix, dateAcquisition);
        this.conservation = conservation;
    }

    /**
     * Obtient la méthode de conservation du produit laitier.
     *
     * @return La méthode de conservation du produit laitier.
     */
    public String getConservation() {
        return conservation;
    }

    /**
     * Retourne une représentation textuelle du produit laitier.
     *
     * @return Une chaîne de caractères représentant le produit laitier.
     */
    @Override
    public String toString() {
        return super.toString() + " - Conservation: " + conservation;
    }
}
