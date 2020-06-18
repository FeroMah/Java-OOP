package Polymorphism.Exercise.WildFarm_03.wildFarm;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        setAnimalType(animalType);
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }


    private void setAnimalType(String animalType) {
        switch (animalType) {
            case "Cat":
            case "Mouse":
            case "Zebra":
            case "Tiger":
                this.animalType = animalType;
                break;
        }
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

}
