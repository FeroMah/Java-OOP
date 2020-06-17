package InterfacesAndAbstraction.Exercise.BirthdayCelebrations_03;



import InterfacesAndAbstraction.Exercise.BirthdayCelebrations_03.DefineAnInterfacePerson.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole;
        List<Birthable> listOfBirthables = new ArrayList<>();
        List<Identifiable> listOfRobots = new ArrayList<>();
        while (!"End".equalsIgnoreCase(inputConsole = sc.nextLine())) {
            String[] data = inputConsole.split("\\s+");
            String classType = data[0];
            switch (classType) {
                case "Citizen":
                    String namePerson = data[1];
                    int age = Integer.parseInt(data[2]);
                    String idPerson = data[3];
                    String birthDatePerson = data[4];
                    Birthable person = new Citizen(namePerson, age, idPerson, birthDatePerson);
                    listOfBirthables.add(person);
                    break;
                case "Pet":
                    String namePet = data[1];
                    String birthDatePet = data[2];
                    Birthable pet = new Pet(namePet, birthDatePet);
                    listOfBirthables.add(pet);
                    break;
                case "Robot":
                    String model = data[1];
                    String idRobot = data[2];
                    Robot robot = new Robot(model, idRobot);
                    listOfRobots.add(robot);
                    break;
            }
        }
        String filterYear =sc.nextLine().trim();
        boolean isBirthDaysPrinted = false;
        for (Birthable birthable : listOfBirthables) {
            if (birthable.getBirthDate().endsWith("/" +filterYear)) {
                System.out.println(birthable.getBirthDate());
                isBirthDaysPrinted = true;
            }
        }
        if (!isBirthDaysPrinted  ){
            System.out.println("<no output>");
        }
    }
}