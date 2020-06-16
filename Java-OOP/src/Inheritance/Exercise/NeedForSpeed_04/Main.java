package Inheritance.Exercise.NeedForSpeed_04;


import Inheritance.Exercise.NeedForSpeed_04.NeedForSpeed.SportCar;

public class Main {
    public static void main(String[] args) // throws IOException
    {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SportCar ferrari = new SportCar(150,1000);
        ferrari.drive(10);
        System.out.println(ferrari.getFuelConsumption());
        System.out.println(ferrari.getFuel());
    }
}
