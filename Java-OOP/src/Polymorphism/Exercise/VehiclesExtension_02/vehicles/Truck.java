package Polymorphism.Exercise.VehiclesExtension_02.vehicles;

import java.text.DecimalFormat;


public class Truck extends Vehicle {
    private static final double airConditioner = 1.6; // air conditioner and their fuel consumption per km is increased by 1.6;

    public Truck(double fuelTank, double fuelConsumption, double tankCapacity) {
        super(fuelTank, fuelConsumption, tankCapacity);
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
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        double sumFuel = 0.95 * fuel + this.getFuelTank();
        if (sumFuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else {
            this.setFuelTank(sumFuel);
        }
    }
}
