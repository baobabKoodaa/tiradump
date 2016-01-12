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
    public void esimerkit() throws IOException {
        testi("Main.java", 1);
        testi("Main", 5);
    }

    @Test(timeout=1000)
    public void riittavaTestaus() throws IOException {
        testi("rekursio", 1);
        testi("level", 5);
        testi("project", 3);
        testi("xml", 4);
        testi("a", 17);
        testi("c", 11);
    }    
    
    
}
