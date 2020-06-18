package Polymorphism.Exercise.VehiclesExtension_02.vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private static final double airConditioner = 1.4;
    // when the air-conditioner is turned on and
    // its fuel consumption per kilometer is increased with 1.4 liters.


    public Bus(double fuelTank, double fuelConsumption, double tankCapacity) {
        super(fuelTank, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double traveledDistance) {
        double maxDistance = this.getFuelTank() / (this.getFuelConsumption() + airConditioner);
        if (maxDistance >= traveledDistance) {
            double fuelBurned = traveledDistance * (this.getFuelConsumption() + airConditioner);
            setFuelTank(getFuelTank() - fuelBurned);
            throw new IllegalArgumentException("Bus travelled " + new DecimalFormat("##########.##")
                    .format(traveledDistance) + " km");
        } else {
            throw new IllegalArgumentException("Bus needs refueling");
        }
    }

    public void driveEmpty(double traveledDistance) {
        double maxDistance = this.getFuelTank() / this.getFuelConsumption();
        if (maxDistance >= traveledDistance) {
            double fuelBurned = traveledDistance * this.getFuelConsumption();
            setFuelTank(getFuelTank() - fuelBurned);
            throw new IllegalArgumentException("Bus travelled " + new DecimalFormat("##########.##")
                    .format(traveledDistance) + " km");
        } else {
            throw new IllegalArgumentException("Bus needs refueling");
        }
    }

}
