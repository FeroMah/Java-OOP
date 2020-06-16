package Inheritance.Exercise.Animals_06.animals;

public class Cat extends Animal {
    private String sound;

    public Cat(String name, int age, String gender) throws Exception {
        super(name, age, gender);
        this.sound = "Meow meow";
    }

    public String produceSound() {
        return this.sound;
    }
}
