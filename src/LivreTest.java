import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class LivreTest {
    @Test
    public void testLivreToString() {
        Livre livre = new Livre("Les Misérables", "12345678", 19.99, new Date(), "Victor Hugo", "Gallimard", "Édition originale", "1862-01-01");
        String expected = "Les Misérables - Code barre: 12345678 - Prix: 19.99 - Date d'acquisition: " + livre.getDateAcquisition() +
                " - Auteur: Victor Hugo - Maison d'édition: Gallimard - Edition: Édition originale - Date de production: 1862-01-01";
        assertEquals(expected, livre.toString());
    }

    @Test
    public void testLivreGetAuteur() {
        Livre livre = new Livre("Les Misérables", "12345678", 19.99, new Date(), "Victor Hugo", "Gallimard", "Édition originale", "1862-01-01");
        assertEquals("Victor Hugo", livre.getAuteur());
    }
}