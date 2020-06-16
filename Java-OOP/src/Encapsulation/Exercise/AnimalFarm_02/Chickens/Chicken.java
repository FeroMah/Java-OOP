package Encapsulation.Exercise.AnimalFarm_02.Chickens;


public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.trim().length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }


    private double calculateProductPerDay() {
        double eggsPerDay = 0.0;
        if (this.age < 6) {
            eggsPerDay = 2.0;
        } else if (this.age < 11) {
            eggsPerDay = 1.0;
        } else if (this.age < 16) {
            eggsPerDay = 0.75;
        }
        return eggsPerDay;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, productPerDay());
    }
}
