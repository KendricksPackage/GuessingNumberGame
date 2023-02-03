import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static int number;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            number = random.nextInt(10) + 1;
            System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
            int guess = 0;
            int tries = 0;
            while (tries < 3) {
                System.out.println("Enter your guess:");
                guess = sc.nextInt();
                if (guess == number) {
                    System.out.println("You got it right! The number was " + number);
                    break;
                }
                System.out.println("That's not it. Try again.");
                tries++;
            }
            if (tries == 3) {
                System.out.println("You lost! The number was " + number);
            }
        }
    }
}
