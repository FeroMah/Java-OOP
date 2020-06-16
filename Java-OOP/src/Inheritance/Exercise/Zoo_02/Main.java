package Inheritance.Exercise.Zoo_02;



import Inheritance.Exercise.Zoo_02.zoo.Gorilla;
import Inheritance.Exercise.Zoo_02.zoo.Lizard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) // throws IOException
     {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         Lizard lizard = new Lizard("lizard Peppy");
         Gorilla gorilla= new Gorilla("hairry Fero");

         System.out.println(gorilla.getName());
         System.out.println(lizard.getName());

     }
}
