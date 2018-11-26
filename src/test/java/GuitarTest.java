import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar("Wood", "Black", InstrumentType.STRING, 50,75, 6);
    }

    @Test
    public void canPlay(){
        assertEquals("Playing Guitar...", guitar.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(25, guitar.calculateMarkUp(),0.01);
    }

    @Test
    public void canSetStrings(){
        guitar.setNumberOfStrings(4);
        assertEquals(4, guitar.getNumberOfStrings());
    }
}
