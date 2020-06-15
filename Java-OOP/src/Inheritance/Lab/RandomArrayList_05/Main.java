package Inheritance.Lab.RandomArrayList_05;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> randomList = new RandomArrayList<>();
        randomList.add("Fero");
        randomList.add("1");
        randomList.add("2");
        randomList.add("3");
        randomList.add("4");
        randomList.add("5");
        randomList.add("6");
        System.out.println(randomList.getRandomElement());
    }
}
