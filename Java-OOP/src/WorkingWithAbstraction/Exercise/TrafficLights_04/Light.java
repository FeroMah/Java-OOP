package WorkingWithAbstraction.Exercise.TrafficLights_04;


import java.util.ArrayList;
import java.util.List;

public class Light {
    private String color;
    private List<String> switchedLiths;

    public Light() {
        this.switchedLiths = new ArrayList<>();
        this.color = "";
    }

    public Light(String color) {
        this.color = Color.valueOf(color).getColor();
    }

    public String getColor() {
        return this.color;
    }

    public static List<String> getSwitchedLights(List<String> previousLights) {
        List<String> nextLights = new ArrayList<>();
        for (String previousLight : previousLights) {
            Light light = new Light(previousLight);
            nextLights.add(light.color);
        }
        return nextLights;
    }
}