package InterfacesAndAbstraction.Exercise.FoodShortage_04;



import InterfacesAndAbstraction.Exercise.FoodShortage_04.MultipleImplementation.Buyer;
import InterfacesAndAbstraction.Exercise.FoodShortage_04.MultipleImplementation.Citizen;
import InterfacesAndAbstraction.Exercise.FoodShortage_04.MultipleImplementation.Rebel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        Map<String, Buyer> buyersMap = new LinkedHashMap<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] data = sc.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            if (data.length == 4) {    // is Citizen
                String id = data[2];
                String birthData = data[3];
                Buyer citizen = new Citizen(name, age, id, birthData);
                buyersMap.putIfAbsent(name, citizen);
            } else {                 // is Rebel
                String group = data[2];
                Buyer rebel = new Rebel(name, age, group);
                buyersMap.putIfAbsent(name, rebel);
            }
        }
        String inputName;
        while(!"end".equalsIgnoreCase(inputName=sc.nextLine())){
            if (buyersMap.containsKey(inputName)){
                buyersMap.get(inputName).buyFood();
            }
        }
       int totalBoughtFood =buyersMap.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalBoughtFood);
    }
}
