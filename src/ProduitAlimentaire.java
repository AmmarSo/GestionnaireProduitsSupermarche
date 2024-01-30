import java.util.Date;

/**
 * Classe représentant un produit alimentaire.
 */
public class ProduitAlimentaire extends Produit {
    private Date datePeremption;

    /**
     * Constructeur de la classe ProduitAlimentaire.
     *
     * @param intitule         L'intitulé du produit.
     * @param codeBarre        Le code-barre du produit.
     * @param prix             Le prix du produit.
     * @param dateAcquisition  La date d'acquisition du produit.
     * @param datePeremption   La date de péremption du produit alimentaire.
     */
    public ProduitAlimentaire(String intitule, String codeBarre, double prix, Date dateAcquisition, Date datePeremption) {
        super(intitule, codeBarre, prix, dateAcquisition);
        this.datePeremption = datePeremption;
    }

    /**
     * Obtient la date de péremption du produit alimentaire.
     *
     * @return La date de péremption du produit alimentaire.
     */
    public Date getDatePeremption() {
        return datePeremption;
    }

    /**
     * Retourne une représentation textuelle du produit alimentaire.
     *
     * @return Une chaîne de caractères représentant le produit alimentaire.
     */
    @Override
    public String toString() {
        return super.toString() + " - Date de péremption: " + datePeremption;
    }
}
