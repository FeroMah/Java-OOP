package Encapsulation.Exercise.PizzaCalories_04;



import Encapsulation.Exercise.PizzaCalories_04.PizzaCalories.Dough;
import Encapsulation.Exercise.PizzaCalories_04.PizzaCalories.Pizza;
import Encapsulation.Exercise.PizzaCalories_04.PizzaCalories.Topping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// This class is used for testing. No actual input or output is required to complete the task.
public class Main {
    public static void main(String[] args) throws IOException {
        Pizza pizza = new Pizza("asd            ",1);
        Dough dough = new Dough("Wholegrain","Chewy",1);
        pizza.setDough(dough);
        Topping topping = new Topping("Cheese  ",50);
        Topping topping1 = new Topping("Sauce",50);
        pizza.addTopping(topping);
        pizza.addTopping(topping1);
        System.out.println(pizza.getOverallCalories());
    }
}
