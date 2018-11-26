import org.junit.Before;
import org.junit.Test;
import shopItems.Drumstick;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void before(){
       drumstick = new Drumstick("Accessory", 12.50, 17);
    }

    @Test
    public void canCalculateMArkUp(){
        assertEquals(4.50, drumstick.calculateMarkUp(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        drumstick.setSellPrice(16.50);
        assertEquals(16.50, drumstick.getSellPrice(), 0.01);
    }
}
