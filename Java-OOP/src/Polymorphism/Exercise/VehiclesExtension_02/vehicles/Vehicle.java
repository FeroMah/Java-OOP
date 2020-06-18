package Polymorphism.Exercise.VehiclesExtension_02.vehicles;

public abstract class Vehicle {

    private double fuelTank;
    private double fuelConsumption;
    private double tankCapacity;

    Vehicle(double fuelTank, double fuelConsumption, double tankCapacity) {
        setFuelTank(fuelTank);
        this.fuelConsumption = fuelConsumption;
        setTankCapacity(tankCapacity);
    }

    public abstract void drive(double traveledDistance);

    public void refuel(double fuel) {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getFuelTank() + fuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else this.setFuelTank(this.getFuelTank() + fuel);
    }


    public double getFuelTank() {
        return this.fuelTank;
    }

    protected void setFuelTank(double fuelTank) {
        if (fuelTank <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelTank = fuelTank;
    }

    protected double getFuelConsumption() {
        return this.fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected double getTankCapacity() {
        return this.tankCapacity;
    }

    protected void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.tankCapacity = tankCapacity;
    }

}
