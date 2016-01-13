import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import java.io.IOException;
import java.util.Arrays;

@Points("2.1")
public class MainTest {
    public void testi(String haku, int tulos) throws IOException {
        int uusi = Main.count(haku);
        assertTrue("Kun hakusana on " + haku + ", tiedostoja tulisi löytyä " +
                   tulos + ", mutta metodisi palauttaa " + uusi + ".",
                   uusi == tulos);
    }

    @Test(timeout=1000)
    public void riittavaTestaus() throws IOException {
        testi("hassu", 1);
        testi("rekursio", 1);
        testi("level", 5);
        testi("sivuhaara", 1);
        testi("a", 6);
        testi("t", 11);
    }    
    
    
}
