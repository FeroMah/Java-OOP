package Polymorphism.Exercise.WildFarm_03.wildFarm;

import java.text.DecimalFormat;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Meat")) {
            this.foodEaten += food.getQuantity();
        } else {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return String.format("Tiger[%s, %s, %s, %d]",
                this.animalName, new DecimalFormat("########.##").format(this.animalWeight)
                , this.livingRegion, this.foodEaten);
    }
}
