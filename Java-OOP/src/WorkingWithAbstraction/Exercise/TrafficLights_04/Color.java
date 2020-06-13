package WorkingWithAbstraction.Exercise.TrafficLights_04;

public enum Color {
    RED("GREEN"), GREEN("YELLOW"), YELLOW("RED");
    private String color;

    Color(String color) {
        this.color = color;
    }


    public String getColor() {
        return this.color;
    }
}
