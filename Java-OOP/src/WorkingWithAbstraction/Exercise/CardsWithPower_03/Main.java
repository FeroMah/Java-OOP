package WorkingWithAbstraction.Exercise.CardsWithPower_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String rank = br.readLine().toUpperCase();
        String suit = br.readLine().toUpperCase();
        Card card = new Card(rank,suit);

        card.printCalculatedPower();
    }
}
