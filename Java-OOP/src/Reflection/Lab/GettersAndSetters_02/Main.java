package Reflection.Lab.GettersAndSetters_02;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Class reflection = Reflection.class;
        Method[] declaredMethods = reflection.getDeclaredMethods();
        List<Method> allGetters = new ArrayList<>();
        List<Method> allSetters = new ArrayList<>();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")) {
                allGetters.add(declaredMethod);
            } else if (declaredMethod.getName().startsWith("set")) {
                allSetters.add(declaredMethod);
            }
        }
        allGetters = allGetters.stream().sorted(Comparator.comparing(Method::getName)).collect(Collectors.toList());
        allSetters = allSetters.stream().sorted(Comparator.comparing(Method::getName)).collect(Collectors.toList());

        for (Method getter : allGetters) {
            System.out.println(String.format("%s will return class %s", getter.getName(), getter.getReturnType().getName()));
        }
        for (Method setter : allSetters) {
            System.out.println(String.format("%s and will set field of class %s", setter.getName(), setter.getParameterTypes()[0].getName()));
        }
    }
}
