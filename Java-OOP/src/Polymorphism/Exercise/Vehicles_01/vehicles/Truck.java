package Polymorphism.Exercise.Vehicles_01.vehicles;

import java.text.DecimalFormat;

import static java.lang.String.format;

public class Truck extends Vehicle {
    private static final double airConditioner = 1.6; // air conditioner and their fuel consumption per km is increased by 1.6;

    public Truck(double fuelTank, double fuelConsumption) {
        super(fuelTank, fuelConsumption);
    }

    @Override
    public void drive(double traveledDistance) {
        double maxDistance = this.getFuelTank() / (this.getFuelConsumption() + airConditioner);
        if (maxDistance >= traveledDistance) {
            double fuelBurned = traveledDistance * (this.getFuelConsumption() + airConditioner);
            setFuelTank(getFuelTank() - fuelBurned);
            throw new IllegalArgumentException("Truck travelled " + new DecimalFormat("##########.##")
                    .format(traveledDistance) + " km");
        } else {
            throw new IllegalArgumentException("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double fuel) {
        double sumFuel = 0.95 * fuel + this.getFuelTank();
        this.setFuelTank(sumFuel);
    }
}
