package Inheritance.Exercise.PlayersAndMonsters_03;




import Inheritance.Exercise.PlayersAndMonsters_03.hero.Hero;
import Inheritance.Exercise.PlayersAndMonsters_03.hero.SoulMaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) // throws IOException
     {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         SoulMaster soulMaster = new SoulMaster("Fero", 99);
         System.out.println(soulMaster);
         System.out.println();
         Hero hero = new Hero("Beny", 32);
         System.out.println(hero);
     }
}
