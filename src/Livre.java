import java.util.Date;

/**
 * Classe représentant un livre.
 */
public class Livre extends Produit {
    private String auteur;
    private String maisonEdition;
    private String edition;
    private String dateProduction;

    /**
     * Constructeur de la classe Livre.
     *
     * @param intitule         L'intitulé du livre.
     * @param codeBarre        Le code-barre du livre.
     * @param prix             Le prix du livre.
     * @param dateAcquisition  La date d'acquisition du livre.
     * @param auteur           L'auteur du livre.
     * @param maisonEdition    La maison d'édition du livre.
     * @param edition          L'édition du livre.
     * @param dateProduction   La date de production du livre.
     */
    public Livre(String intitule, String codeBarre, double prix, Date dateAcquisition, String auteur, String maisonEdition, String edition, String dateProduction) {
        super(intitule, codeBarre, prix, dateAcquisition);
        this.auteur = auteur;
        this.maisonEdition = maisonEdition;
        this.edition = edition;
        this.dateProduction = dateProduction;
    }

    /**
     * Obtient l'auteur du livre.
     *
     * @return L'auteur du livre.
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Obtient la maison d'édition du livre.
     *
     * @return La maison d'édition du livre.
     */
    public String getMaisonEdition() {
        return maisonEdition;
    }

    /**
     * Obtient l'édition du livre.
     *
     * @return L'édition du livre.
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Obtient la date de production du livre.
     *
     * @return La date de production du livre.
     */
    public String getDateProduction() {
        return dateProduction;
    }

    /**
     * Retourne une représentation textuelle du livre.
     *
     * @return Une chaîne de caractères représentant le livre.
     */
    @Override
    public String toString() {
        return super.toString() + " - Auteur: " + auteur + " - Maison d'édition: " + maisonEdition +
                " - Edition: " + edition + " - Date de production: " + dateProduction;
    }
}
