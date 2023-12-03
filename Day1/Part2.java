package Day1;
import java.util.*;
import java.io.*;

public class Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int sum = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();

            String first = "";
            for (int i = 0; i < line.length(); i++) {
                first = parse(line, i);
                if (!first.equals("")) {
                    break;
                }
            }

            String last = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                last = parse(line, i);
                if (!last.equals("")) {
                    break;
                }
            }

            sum += Integer.parseInt(first + last);
        }
        System.out.println(sum);

    }

    private static String parse(String line, int i) {
        if (Character.isDigit(line.charAt(i))) {
            return line.charAt(i) + "";
        }
        if (i + 3 <= line.length()) { // one two six
            String sub = line.substring(i, i + 3);
            if (sub.equals("one")) {
                return "1";
            }
            if (sub.equals("two")) {
                return "2";
            }
            if (sub.equals("six")) {
                return "6";
            }
        }
        if (i + 4 <= line.length()) { // four five nine
            String sub = line.substring(i, i + 4);
            if (sub.equals("four")) {
                return "4";
            }
            if (sub.equals("five")) {
                return "5";
            }
            if (sub.equals("nine")) {
                return "9";
            }
        }
        if (i + 5 <= line.length()) { // three seven eight
            String sub = line.substring(i, i + 5);
            if (sub.equals("three")) {
                return "3";
            }
            if (sub.equals("seven")) {
                return "7";
            }
            if (sub.equals("eight")) {
                return "8";
            }
        }
        return "";
    }
}