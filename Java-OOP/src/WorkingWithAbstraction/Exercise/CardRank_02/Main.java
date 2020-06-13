package WorkingWithAbstraction.Exercise.CardRank_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine= sc.nextLine();
        Deck deck = new Deck();
        switch (inputLine){
            case "Card Suits":
                System.out.println("Card Suits:");
                System.out.println(deck);
                break;
            case "Card Ranks":
                System.out.println("Card Ranks:");
                System.out.println(deck);
        }
    }
}
