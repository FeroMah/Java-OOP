package WorkingWithAbstraction.Exercise.CardsWithPower_03;

public class Card {

    private String rankName;
    private String suitName;
    private int rankPower;
    private int suitPower;

    public Card(String rank, String suit) {
        this.rankName = rank;
        this.suitName = suit;
        this.rankPower = Power.RankPower.valueOf(rank).getRankPower();
        this.suitPower = Power.SuitPower.valueOf(suit).getSuitPower();
    }

    private int getRankPower() {
        return this.rankPower;
    }

    private int getSuitPower() {
        return this.suitPower;
    }

    private int calculatePower() {
        return getRankPower() + getSuitPower();
    }

    public void printCalculatedPower() {
        System.out.println(String.format("Card name: %s of %s; Card power: %d", this.rankName, this.suitName, calculatePower()));
    }
}
