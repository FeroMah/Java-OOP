package Inheritance.Exercise.Animals_06.animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();
        String input;
        while (!("Beast!").equalsIgnoreCase(input = br.readLine())) {
            String[] secondLine = br.readLine().split("\\s+");
            String name = secondLine[0];
            int age = Integer.parseInt(secondLine[1]);
            String gender = secondLine[2];
            switch (input) {
                case "Cat":
                    try {
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;
                case "Dog":
                    try {
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;
                case "Frog":
                    try {
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;
                case "Kitten":
                    try {
                        Kitten kitten = new Kitten(name, age);
                        animals.add(kitten);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;
                case "Tomcat":
                    try {
                        Tomcat tomcat = new Tomcat(name, age);
                        animals.add(tomcat);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                    }
                    break;
            }
        }
        printTheList(animals);
    }

    private static void printTheList(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
