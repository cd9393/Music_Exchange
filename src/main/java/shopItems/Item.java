package shopItems;

import behaviours.ISell;

public abstract class Item implements ISell {
    private String type;
    private double purchasePrice;
    private double sellPrice;

    public Item(String type, double purchasePrice, double sellPrice){
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.purchasePrice;
    }
}
