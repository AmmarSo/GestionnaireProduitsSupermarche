import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ProduitLaitierTest {
    @Test
    public void testProduitLaitierToString() {
        ProduitLaitier produit = new ProduitLaitier("Yaourt", "12345678", 2.5, new Date(), "Au froid");
        String expected = "Yaourt - Code barre: 12345678 - Prix: 2.5 - Date d'acquisition: " + produit.getDateAcquisition() + " - Conservation: Au froid";
        assertEquals(expected, produit.toString());
    }

    @Test
    public void testProduitLaitierGetConservation() {
        ProduitLaitier produit = new ProduitLaitier("Yaourt", "12345678", 2.5, new Date(), "Au froid");
        assertEquals("Au froid", produit.getConservation());
    }
}
