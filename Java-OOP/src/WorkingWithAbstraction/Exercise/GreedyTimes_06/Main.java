
package WorkingWithAbstraction.Exercise.GreedyTimes_06;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> backpack = new LinkedHashMap<>();
        long gold = 0, gems = 0, money = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long quantity = Long.parseLong(safe[i + 1]);

            String whatIsIt = "";

            if (name.length() == 3) {
                whatIsIt = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                whatIsIt = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                whatIsIt = "Gold";
            }

            if (whatIsIt.equals("")) {
                continue;
            } else if (input < backpack.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (whatIsIt) {
                case "Gem":
                    if (!backpack.containsKey(whatIsIt)) {
                        if (backpack.containsKey("Gold")) {
                            if (quantity > backpack.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (backpack.get(whatIsIt).values().stream().mapToLong(e -> e).sum() + quantity > backpack.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!backpack.containsKey(whatIsIt)) {
                        if (backpack.containsKey("Gem")) {
                            if (quantity > backpack.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (backpack.get(whatIsIt).values().stream().mapToLong(e -> e).sum() + quantity > backpack.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!backpack.containsKey(whatIsIt)) {
                backpack.put((whatIsIt), new LinkedHashMap<>());
            }

            if (!backpack.get(whatIsIt).containsKey(name)) {
                backpack.get(whatIsIt).put(name, 0L);
            }


            backpack.get(whatIsIt).put(name, backpack.get(whatIsIt).get(name) + quantity);
            if (whatIsIt.equals("Gold")) {
                gold += quantity;
            } else if (whatIsIt.equals("Gem")) {
                gems += quantity;
            } else if (whatIsIt.equals("Cash")) {
                money += quantity;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> x : backpack.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}
