package WorkingWithAbstraction.Exercise.CardsWithPower_03;

public class Power {
    public enum RankPower {
        ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
        private int rankPower;

        RankPower(int rankPower) {
            this.rankPower = rankPower;
        }

        public int getRankPower() {
            return this.rankPower ;
        }
    }

    public enum SuitPower {
        CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
        private int suitPower;

        SuitPower(int suitPower) {
            this.suitPower = suitPower;
        }

        public int getSuitPower() {
            return this.suitPower;
        }
    }
}