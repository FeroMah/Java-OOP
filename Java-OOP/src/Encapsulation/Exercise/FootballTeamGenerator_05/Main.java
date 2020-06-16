package Encapsulation.Exercise.FootballTeamGenerator_05;



import Encapsulation.Exercise.FootballTeamGenerator_05.FootballTeamGenerator.Player;
import Encapsulation.Exercise.FootballTeamGenerator_05.FootballTeamGenerator.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> footballLeague = new LinkedHashMap<>();
        String inputConsoleLine;

        while (!"End".equalsIgnoreCase(inputConsoleLine = reader.readLine())) {
            String[] data = inputConsoleLine.split(";");
            String command = data[0];
            String teamName = data[1];
            switch (command) {
                case "Team":
                    footballLeague.putIfAbsent(teamName, new Team(teamName, new ArrayList<>()));
                    break;
                case "Add":
                    try {
                        if (!footballLeague.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        } else {
                            Player player = new Player(data[2], Integer.parseInt(data[3]),
                                    Integer.parseInt(data[4]), Integer.parseInt(data[5]),
                                    Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                            footballLeague.get(teamName).addPlayer(player);
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Remove":
                    try {
                        footballLeague.get(teamName).removePlayer(data[2]);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Rating":
                    try {
                        if (!footballLeague.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        } else {
                            System.out.println(String.format("%s - %.0f", teamName, footballLeague.get(teamName).getRating()));
                        }
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
