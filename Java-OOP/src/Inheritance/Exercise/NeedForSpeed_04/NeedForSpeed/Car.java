package Inheritance.Exercise.NeedForSpeed_04.NeedForSpeed;

public class Car extends Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
