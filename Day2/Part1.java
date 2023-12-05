package Day2;

import java.io.*;
import java.util.*;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        List<Bag> games = new ArrayList<>();
        while (in.hasNextLine()) {
            Bag bag = new Bag();
            String[] rounds = in.nextLine().split(":")[1].split(";");
            Arrays.stream(rounds).forEach(round -> {
                Arrays.stream(round.split(",")).forEach(e -> {
                    var block = e.trim().split(" ");
                    if (block[1].equals("blue")) {
                        bag.blue = Math.max(bag.blue, Integer.parseInt(block[0]));
                    } else if (block[1].equals("red")) {
                        bag.red = Math.max(bag.red, Integer.parseInt(block[0]));
                    } else if (block[1].equals("green")) {
                        bag.green = Math.max(bag.green, Integer.parseInt(block[0]));
                    }
                });
            });
            games.add(bag);
        }
        int sum = 0;
        for (int i = 0; i < games.size(); i++) {
            var curr = games.get(i);
            if (curr.red <= 12 && curr.green <= 13 && curr.blue <= 14) {
                sum += i + 1;
            }
        }
        System.out.println(sum);
        
    }
}
