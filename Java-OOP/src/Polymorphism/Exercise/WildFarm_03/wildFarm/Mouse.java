package Polymorphism.Exercise.WildFarm_03.wildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");

    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            this.foodEaten += food.getQuantity();
        }else {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return String.format("Mouse[%s, %s, %s, %d]",
                this.animalName, new DecimalFormat("########.##").format(this.animalWeight)
                , this.livingRegion, this.foodEaten);
    }
}
