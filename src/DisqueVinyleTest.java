import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DisqueVinyleTest {
    @Test
    public void testDisqueVinyleToString() {
        DisqueVinyle vinyle = new DisqueVinyle("La Bohème", "12345678", 25.0, new Date(), "Charles Aznavour", 1965, false, "très bon");
        String expected = "La Bohème - Code barre: 12345678 - Prix: 25.0 - Date d'acquisition: " + vinyle.getDateAcquisition() +
                " - Artiste: Charles Aznavour - Année de production: 1965 - Collector: false - État de conservation: très bon";
        assertEquals(expected, vinyle.toString());
    }

    @Test
    public void testDisqueVinyleGetArtiste() {
        DisqueVinyle vinyle = new DisqueVinyle("La Bohème", "12345678", 25.0, new Date(), "Charles Aznavour", 1965, false, "très bon");
        assertEquals("Charles Aznavour", vinyle.getArtiste());
    }
}