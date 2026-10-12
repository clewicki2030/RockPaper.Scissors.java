import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {
            String a, b;

            do {
                System.out.print("Player A (R/P/S): ");
                a = input.nextLine();
            } while (!a.matches("(?i)[RPS]"));

            do {
                System.out.print("Player B (R/P/S): ");
                b = input.nextLine();
            } while (!b.matches("(?i)[RPS]"));

            a = a.toUpperCase();
            b = b.toUpperCase();

             if (a.equals(b)) ;
            System.out.println("It's a tie!");
             if ((a.equals("R") && b.equals("S")) ||
                    (a.equals("P") && b.equals("R")) ||
                    (a.equals("S") && b.equals("P")))
                System.out.println("Player A wins!");
            else
                System.out.println("Player B wins!");
            System.out.print("Play again? (Y/N): ");
            again = input.nextLine();
        }

        input.close();
    }}