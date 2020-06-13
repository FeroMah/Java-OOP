package WorkingWithAbstraction.Exercise.CardRank_02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Deck {
    private static List<Card> data;

    static {
        int startValue = 0;
        data = new ArrayList<>();
        data.add(new Card(startValue++, "ACE"));
        data.add(new Card(startValue++, "TWO"));
        data.add(new Card(startValue++, "THREE"));
        data.add(new Card(startValue++, "FOUR"));
        data.add(new Card(startValue++, "FIVE"));
        data.add(new Card(startValue++, "SIX"));
        data.add(new Card(startValue++, "SEVEN"));
        data.add(new Card(startValue++, "EIGHT"));
        data.add(new Card(startValue++, "NINE"));
        data.add(new Card(startValue++, "TEN"));
        data.add(new Card(startValue++, "JACK"));
        data.add(new Card(startValue++, "QUEEN"));
        data.add(new Card(startValue++, "KING"));
    }

    public Deck() {
    }

    public int getSize() {
        return this.data.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : data) {
            sb.append(card).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
