package Inheritance.Exercise.Person_01;



import Inheritance.Exercise.Person_01.person.Child;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputName = reader.readLine();
        int inputAge=Integer.parseInt(reader.readLine());

        Child child = new Child(inputName, inputAge);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
