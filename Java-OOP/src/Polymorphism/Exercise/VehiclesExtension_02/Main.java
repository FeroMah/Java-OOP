package Polymorphism.Exercise.VehiclesExtension_02;


import Polymorphism.Exercise.VehiclesExtension_02.vehicles.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> carInfo = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        double carFuelTank = Double.parseDouble(carInfo.get(1));
        double carFuelConsumption = Double.parseDouble(carInfo.get(2));
        double carTankCapacity = Double.parseDouble(carInfo.get(3));
        Vehicle car = new Car(carFuelTank, carFuelConsumption, carTankCapacity);

        List<String> truckInfo = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        double truckFuelTank = Double.parseDouble(truckInfo.get(1));
        double truckFuelConsumption = Double.parseDouble(truckInfo.get(2));
        double truckTankCapacity = Double.parseDouble(truckInfo.get(3));
        Vehicle truck = new Truck(truckFuelTank, truckFuelConsumption, truckTankCapacity);

        List<String> busInfo = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        double busFuelTank = Double.parseDouble(busInfo.get(1));
        double busFuelConsumption = Double.parseDouble(busInfo.get(2));
        double busTankCapacity = Double.parseDouble(busInfo.get(3));
        Vehicle bus = new Bus(busFuelTank, busFuelConsumption, busTankCapacity);

        int numberCommands = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberCommands; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String operation = input[0];
            String typeVehicle = input[1];
            try {
                switch (operation) {
                    case "DriveEmpty":
                        if (typeVehicle.equalsIgnoreCase("Bus")) {
                            bus.drive(Double.parseDouble(input[2]));
                        }
                        break;
                    case "Drive":
                        double distance = Double.parseDouble(input[2]);
                        if (typeVehicle.equalsIgnoreCase("Car")) {
                            car.drive(distance);
                        } else if (typeVehicle.equalsIgnoreCase("Truck")) {
                            truck.drive(distance);
                        } else if (typeVehicle.equalsIgnoreCase("Bus")) {
                            bus.drive(distance);
                        }

                        break;
                    case "Refuel":
                        double fuelAddToTank = Double.parseDouble(input[2]);
                        if (typeVehicle.equalsIgnoreCase("Car")) {
                            car.refuel(fuelAddToTank);
                        } else if (typeVehicle.equalsIgnoreCase("Truck")) {
                            truck.refuel(fuelAddToTank);
                        } else if (typeVehicle.equalsIgnoreCase("Bus")) {
                            bus.refuel(fuelAddToTank);
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(String.format("Car: %.2f", car.getFuelTank()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelTank()));
        System.out.println(String.format("Bus: %.2f", bus.getFuelTank()));
    }
}
