package Encapsulation.Exercise.PizzaCalories_04.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (name.trim().equalsIgnoreCase("") || name.trim().isEmpty() || name.trim().length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            this.name = name.trim();
        }
    }

    private void setToppings(int numberOfToppings) {
        if (0 <= numberOfToppings && numberOfToppings <= 10) {
            this.toppings = new ArrayList<>(numberOfToppings);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = new Dough(dough.getFlourType(),dough.getBakingTechnique(),dough.getWeight());
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
		if (this.toppings.size()>10){
		throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		}
            this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double sumCaloriesOfToppings = 0.0;
        for (Topping topping : this.toppings) {
            sumCaloriesOfToppings += topping.calculateCalories();

        }
        return this.dough.calculateCalories() + sumCaloriesOfToppings;
    }
}
