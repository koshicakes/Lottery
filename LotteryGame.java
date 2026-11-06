import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Simple Lottery ===");
        System.out.println("Pick 3 numbers from 1 to 10.");

        int[] guesses = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            guesses[i] = scanner.nextInt();
        }

        int matches = 0;
        System.out.print("Winning numbers: ");
        for (int i = 0; i < 3; i++) {
            int winning = random.nextInt(10) + 1;
            System.out.print(winning + " ");
            if (winning == guesses[i]) {
                matches++;
            }
        }

        System.out.println("\nYou matched " + matches + " in the right position.");
        if (matches == 3) {
            System.out.println("JACKPOT! You win!");
        } else if (matches > 0) {
            System.out.println("Nice, small prize!");
        } else {
            System.out.println("No luck this time.");
        }

        scanner.close();
    }
}