package Reflection.Lab.HighQualityMistakes_03;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Class reflection = Reflection.class;
        List<Field> allFields = Arrays.stream(reflection.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .collect(Collectors.toList());
        for (Field field : allFields) {
            if (!Modifier.isPrivate(field.getModifiers())) {
                System.out.println(String.format("%s must be private!", field.getName()));
            }
        }
        List<Method> allMethods = Arrays.stream(reflection.getDeclaredMethods())
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toList());
        for (Method method : allMethods) {
            if (method.getName().startsWith("get")) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    System.out.println(String.format("%s have to be public!", method.getName()));
                }
            } else if (method.getName().startsWith("set")) {
                if (!Modifier.isPrivate(method.getModifiers())) {
                    System.out.println(String.format("%s have to be private!", method.getName()));
                }
            }
        }
    }
}