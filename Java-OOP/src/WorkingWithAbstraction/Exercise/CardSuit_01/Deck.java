package WorkingWithAbstraction.Exercise.CardSuit_01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Deck {
    private static Map<String, Card> data;

    //    Ordinal value: 0; Name value: CLUBS
//    Ordinal value: 1; Name value: DIAMONDS
//    Ordinal value: 2; Name value: HEARTS
//    Ordinal value: 3; Name value: SPADES
    static {
        int startValue = 0;
        data = new LinkedHashMap<>();
        data.putIfAbsent("CLUBS", new Card(startValue++, "CLUBS"));
        data.putIfAbsent("DIAMONDS", new Card(startValue++, "DIAMONDS"));
        data.putIfAbsent("HEARTS", new Card(startValue++, "HEARTS"));
        data.putIfAbsent("SPADES", new Card(startValue++, "SPADES"));
    }

    public Deck() {
    }

    public int getSize() {
        return this.data.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card Suits:").append(System.lineSeparator());
        for (Card card : data.values()) {
            sb.append(card);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
