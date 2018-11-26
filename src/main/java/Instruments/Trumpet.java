package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double purchasePrice, double sellPrice, int numberOfValves) {

        super(material, colour, type, purchasePrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public String play() {
        return "Playing Trumpet...";
    }
}
