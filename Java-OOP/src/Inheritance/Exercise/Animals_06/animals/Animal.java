package Inheritance.Exercise.Animals_06.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) throws Exception {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() == 0) {
            throw new Exception();
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception();
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws Exception {
        if (gender.equalsIgnoreCase("Female")
                || gender.equalsIgnoreCase("Male")) {
            this.gender = gender;
        } else {
            throw new Exception();
        }
    }
    public String produceSound(){
        return this.produceSound();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append(getName()).append(" ").append(getAge()).append(" ").append(getGender()).append(System.lineSeparator())
                .append(this.produceSound());
        return sb.toString();
    }
}