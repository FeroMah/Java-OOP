package Polymorphism.Exercise.WildFarm_03;



import Polymorphism.Exercise.WildFarm_03.wildFarm.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        ArrayDeque<Food> foodQueue = new ArrayDeque<>();
        String input;
        while (!"End".equalsIgnoreCase(input = sc.nextLine())) {

            List<String> animalInfo = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String animalType = animalInfo.get(0);
            String animalName = animalInfo.get(1);
            Double animalWeight = Double.parseDouble(animalInfo.get(2));
            String animalLivingRegion = animalInfo.get(3);
            List<String> foodInfo = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
            String foodType = foodInfo.get(0);
            Integer foodQuantity = Integer.parseInt(foodInfo.get(1));
            switch (foodType.toLowerCase()) {
                case "vegetable":
                    Food vegetable = new Vegetable(foodQuantity);
                    foodQueue.offer(vegetable);
                    break;
                case "meat":
                    Food meat = new Meat(foodQuantity);
                    foodQueue.offer(meat);
                    break;
            }
            switch (animalType.toLowerCase()) {
                case "cat":
                    String breed = animalInfo.get(4);
                    Animal cat = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                    animalList.add(cat);
                    cat.makeSound();
                    try {
                        cat.eat(foodQueue.poll());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "tiger":
                    Animal tiger = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    animalList.add(tiger);
                    tiger.makeSound();
                    try {
                        tiger.eat(foodQueue.poll());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "zebra":
                    Animal zebra = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    animalList.add(zebra);
                    zebra.makeSound();
                    try {
                        zebra.eat(foodQueue.poll());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "mouse":
                    Animal mouse = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    animalList.add(mouse);
                    mouse.makeSound();
                    try {
                        mouse.eat(foodQueue.poll());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}

