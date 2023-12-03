package Day1;
import java.util.*;
import java.io.*;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        int sum = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();

            String first = "";
            for (int i = 0; i < line.length(); i++) {
                if (Character.isDigit(line.charAt(i))) {
                    first = line.charAt(i) + "";
                    break;
                }
            }

            String last = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                if (Character.isDigit(line.charAt(i))) {
                    last = line.charAt(i) + "";
                    break;
                }
            }

            sum += Integer.parseInt(first + last);
        }
        System.out.println(sum);
    }
}