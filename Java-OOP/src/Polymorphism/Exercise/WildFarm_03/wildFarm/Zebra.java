package Polymorphism.Exercise.WildFarm_03.wildFarm;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            this.foodEaten += food.getQuantity();
        } else {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return String.format("Zebra[%s, %s, %s, %d]",
                this.animalName, new DecimalFormat("########.##").format(this.animalWeight)
                , this.livingRegion, this.foodEaten);
    }
}
