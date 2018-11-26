import Instruments.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before

    public void before(){
        trumpet = new Trumpet("Brass", "Bronze", InstrumentType.BRASS, 300, 550, 10);
    }

    @Test
    public void canPlay(){
        assertEquals("Playing Trumpet...", trumpet.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(250, trumpet.calculateMarkUp(),0.01);
    }
}
