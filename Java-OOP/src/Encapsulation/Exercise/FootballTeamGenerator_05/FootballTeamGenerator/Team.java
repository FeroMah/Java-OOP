package Encapsulation.Exercise.FootballTeamGenerator_05.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name, List<Player> players) {
        this.setName(name);
        this.players = new ArrayList<>(players);
    }

    private void setName(String name) {
        if (name == null || name.trim().equalsIgnoreCase("")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        boolean playerDeleted = false;
        for (int i = 0; i < this.players.size(); i++) {
            if (players.get(i).getName().equalsIgnoreCase(name)) {
                players.remove(players.get(i));
                playerDeleted = true;
                i--;
            }
        }
        if (!playerDeleted) {
            throw new IllegalArgumentException("Player " + name + " is not in " + this.getName() + " team.");
        }
    }

    public double getRating() {
        double teamRating = 0.0;
        if (players.size() > 0) {
            for (Player player : players) {
                teamRating += player.overallSkillLevel();
            }
        } else {
            return 0;
        }
        return teamRating / (players.size() * 1.0);
    }
}
