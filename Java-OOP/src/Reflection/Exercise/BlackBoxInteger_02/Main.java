package Reflection.Exercise.BlackBoxInteger_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Scanner sc = new Scanner(System.in);
//        Method[] allMethods = BlackBoxInt.class.getDeclaredMethods();
        Constructor classConstructor = BlackBoxInt.class.getDeclaredConstructor();
        classConstructor.setAccessible(true);
        BlackBoxInt newBlackBoxInt = (BlackBoxInt) classConstructor.newInstance();
        String input;
        while (!"END".equalsIgnoreCase(input = sc.nextLine().trim())) {
            String[] data = input.split("\\_+");
            String command = data[0];
            int value = Integer.parseInt(data[1]);
            Method methodReflection = BlackBoxInt.class.getDeclaredMethod(command, int.class);
            methodReflection.setAccessible(true);
            methodReflection.invoke(newBlackBoxInt, value);
            Field field = BlackBoxInt.class.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.getInt(newBlackBoxInt));
        }
    }
}
