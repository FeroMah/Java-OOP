package Polymorphism.Exercise.Vehicles_01.vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    private static final double airConditioner = 0.9; // fuel consumption per km is increased by 0.9 liters

    public Car(double fuelTank, double fuelConsumption) {
        super(fuelTank, fuelConsumption);
    }

    @Override
    public void drive(double traveledDistance) {
        double maxDistance = this.getFuelTank() / (this.getFuelConsumption() + airConditioner);
        if (maxDistance >= traveledDistance) {
            double fuelBurned = traveledDistance * (this.getFuelConsumption() + airConditioner);
            setFuelTank(getFuelTank() - fuelBurned);
            throw new IllegalArgumentException("Car travelled " + new DecimalFormat("##########.##")
                    .format(traveledDistance) + " km");
        } else {
            throw new IllegalArgumentException("Car needs refueling");
        }
    }

    @Override
    public void refuel(double fuel) {
        double sumFuel = fuel + this.getFuelTank();
        this.setFuelTank(sumFuel);
    }
}
