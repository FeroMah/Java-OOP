package Reflection.Exercise.HarvestingFields_01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputCommandsList = new ArrayList<>();
        String input;
        while (!"HARVEST".equalsIgnoreCase(input = sc.nextLine())) {
            if (inputCommandsList.size() > 100) {
                break;
            }
            switch (input) {
                case "private":
                case "protected":
                case "public":
                case "all":
                    inputCommandsList.add(input);
                    break;
            }
        }
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        for (String command : inputCommandsList) {
            if (command.equalsIgnoreCase("all")) {
                for (Field field : fields) {
                    String accessModifierStr = getAccessModifierString(field);
					printFieldInfo(field, accessModifierStr);
				}
                continue;
            }
            for (Field field : fields) {
                String accessModifierStr = getAccessModifierString(field);
                if (accessModifierStr.equals(command)) {
//     PrintFormat     "<access modifier> <field type> <field name>"
					printFieldInfo(field, accessModifierStr);
				}
            }
        }
    }

	private static void printFieldInfo(Field field, String accessModifierStr) {
		System.out.println(String.format("%s %s %s",
				accessModifierStr, field.getType().getSimpleName(), field.getName()));
	}

	private static String getAccessModifierString(Field field) {
        return Modifier.toString(field.getModifiers());
    }
}
