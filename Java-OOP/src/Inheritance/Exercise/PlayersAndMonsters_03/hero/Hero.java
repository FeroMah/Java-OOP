package Inheritance.Exercise.PlayersAndMonsters_03.hero;

public class Hero {
    private String userName;
    private int level;

    public Hero(String userName, int level) {
        this.userName = userName;
        this.level = level;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUserName(),
                this.getLevel());
    }
}
