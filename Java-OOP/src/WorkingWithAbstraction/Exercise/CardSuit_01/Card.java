package WorkingWithAbstraction.Exercise.CardSuit_01;

public class Card {
    private int ordinal;
    private String name;

    public Card(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",getOrdinal(),getName());
    }
}
