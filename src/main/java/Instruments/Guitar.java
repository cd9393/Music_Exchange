package Instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double purchasePrice, double sellPrice, int numberOfStrings) {
        super(material, colour, type, purchasePrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Playing Guitar...";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
