import behaviours.ISell;
import shopItems.Drumstick;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }


    public int stockSize() {
        return this.stock.size();
    }


    public void add(ISell item) {
        this.stock.add(item);
    }

    public void remove(ISell item) {
        this.stock.remove(item);
    }

    public double potentialProfit() {

        double potentialProfit = 0;
        for(int i = 0; i < stockSize(); i++){
            potentialProfit += stock.get(i).calculateMarkUp();
        }
        return potentialProfit;
    }
}
