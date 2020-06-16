package Encapsulation.Lab.FirstAndReserveTeam_04.team;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        } else {
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }else {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
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

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else {
            this.salary = salary;
        }
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
        return getFirstName() + " " + getLastName() + " gets "
                + new DecimalFormat("######.0#####").format(getSalary());
    }
}
