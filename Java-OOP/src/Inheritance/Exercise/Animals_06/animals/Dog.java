package Inheritance.Exercise.Animals_06.animals;

public class Dog extends Animal {
    private String sound;
    public Dog(String name, int age, String gender) throws Exception {
        super(name, age, gender);
        this.sound ="Woof!";
    }
    public String produceSound() {
        return this.sound;
    }
}
