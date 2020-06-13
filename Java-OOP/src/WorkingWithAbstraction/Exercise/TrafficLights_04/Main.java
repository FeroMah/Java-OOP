package WorkingWithAbstraction.Exercise.TrafficLights_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static WorkingWithAbstraction.Exercise.TrafficLights_04.Light.getSwitchedLights;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputStateOfLights = Arrays.stream(br.readLine().
                split("\\s+")).collect(Collectors.toList());
        int rotations = Integer.parseInt(br.readLine());
        for (int i = 0; i < rotations; i++) {
            List<String> nextLights = getSwitchedLights(inputStateOfLights);
            printListToString(nextLights);
            inputStateOfLights = new ArrayList<>(nextLights);
        }
    }
    private static void printListToString(List<String> list) {
        System.out.println(list.toString().replaceAll("[\\]\\[\\]\\,]", "").trim());
    }
}
