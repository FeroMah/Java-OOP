package Inheritance.Exercise.Animals_06.animals;

public class Tomcat extends Cat{
    private String sound;
    private static final String DEFAULT_GENDER = "Male";
    public Tomcat(String name, int age) throws Exception {
        super(name, age, DEFAULT_GENDER);
        this.sound= "MEOW";
    }
    public String produceSound() {
        return this.sound;
    }
}
