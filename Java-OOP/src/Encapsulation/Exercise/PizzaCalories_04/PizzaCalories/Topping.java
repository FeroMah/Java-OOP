package Encapsulation.Exercise.PizzaCalories_04.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType.trim().toLowerCase()) {
            case "meat":
            case "veggies":
            case "cheese":
            case "sauce":
                break;
            default:
                throw new IllegalArgumentException
                        (String.format("Cannot place %s on top of your pizza.", toppingType.trim()));
        }
        this.toppingType = toppingType.trim();
    }

    private void setWeight(double weight) {
        if (1 <= weight && weight <= 50) {
            this.weight = weight;
        } else
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
    }

    public double calculateCalories() {
        double toppingMultiplier = 0.0;
        if (this.toppingType.equalsIgnoreCase("Meat")) {
            toppingMultiplier = 1.2;
        }
        if (this.toppingType.equalsIgnoreCase("Veggies")) {
            toppingMultiplier = 0.8;
        }
        if (this.toppingType.equalsIgnoreCase("Cheese")) {
            toppingMultiplier = 1.1;
        }
        if (this.toppingType.equalsIgnoreCase("Sauce")) {
            toppingMultiplier = 0.9;
        }

        return 2 * this.weight * toppingMultiplier;
    }
}
