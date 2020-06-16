package Encapsulation.Lab.SalaryIncrease_02.person;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.salary = this.getSalary() + (this.getSalary() * (bonus / 100.0)) / 2;
        } else {
            this.salary = this.getSalary() + this.getSalary() * (bonus / 100.0);
        }
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " "
                + new DecimalFormat("######.0#####").format(getSalary()) + " leva";
    }
}
