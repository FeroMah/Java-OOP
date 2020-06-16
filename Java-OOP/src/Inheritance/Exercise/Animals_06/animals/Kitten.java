package Inheritance.Exercise.Animals_06.animals;

public class Kitten extends Cat {
    private static final String DEFAULT_GENDER = "Female";
    private String sound;
    public Kitten(String name, int age) throws Exception {
        super(name, age, DEFAULT_GENDER);
        this.sound=  "Meow";
    }
    public String produceSound() {
        return this.sound;
    }
}
