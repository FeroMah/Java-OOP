package WorkingWithAbstraction.Exercise.CardSuit_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        Deck deck = new Deck();
        switch (inputConsole) {
            case "Card Suits":
                System.out.println(deck);
                break;
        }
    }
}
