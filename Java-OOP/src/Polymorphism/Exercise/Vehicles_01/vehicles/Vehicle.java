package Polymorphism.Exercise.Vehicles_01.vehicles;

public abstract class Vehicle {

    private double fuelTank;
    private double fuelConsumption;

    Vehicle(double fuelTank, double fuelConsumption) {
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelTank() {
        return this.fuelTank;
    }

    protected void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public abstract void drive(double traveledDistance);

    public abstract void refuel(double fuel);

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

}
