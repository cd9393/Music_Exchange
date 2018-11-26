import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shopItems.Drumstick;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drumstick drumstick;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Music Shop");
        drumstick = new Drumstick("Accessory", 12.50, 17);
        guitar = new Guitar("Wood", "Black", InstrumentType.STRING, 50,75, 6);
    }

    @Test
    public void canAddItemToShop(){
        shop.add(drumstick);
        assertEquals(1, shop.stockSize());
    }

    @Test
    public void canRemoveItemFromShop(){
        shop.add(drumstick);
        shop.remove(drumstick);
        assertEquals(0, shop.stockSize());

    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.add(drumstick);
        shop.add(guitar);
        shop.add(guitar);
        assertEquals(54.50, shop.potentialProfit(), 0.01);
    }
}
