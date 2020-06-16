package Inheritance.Exercise.Animals_06.animals;

public class Frog extends Animal {
    private String sound;
    public Frog(String name, int age, String gender) throws Exception {
        super(name, age, gender);
        this.sound= "Ribbit";
    }
    public String produceSound() {
        return this.sound;
    }
}
