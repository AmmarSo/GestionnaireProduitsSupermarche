import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DVDTest {
    @Test
    public void testDVDToString() {
        DVD dvd = new DVD("La La Land", "12345678", 14.99, new Date(), "Damien Chazelle", 128);
        String expected = "La La Land - Code barre: 12345678 - Prix: 14.99 - Date d'acquisition: " + dvd.getDateAcquisition() +
                " - Réalisateur: Damien Chazelle - Durée: 128 minutes";
        assertEquals(expected, dvd.toString());
    }

    @Test
    public void testDVDGetRealisateur() {
        DVD dvd = new DVD("La La Land", "12345678", 14.99, new Date(), "Damien Chazelle", 128);
        assertEquals("Damien Chazelle", dvd.getRealisateur());
    }
}