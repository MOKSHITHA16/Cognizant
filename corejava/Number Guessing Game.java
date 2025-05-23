import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess the number between 1 and 100. Ready? Go!");

        while (guess != target) {
            System.out.print("Your guess: ");
            guess = s.nextInt();

            if (guess < target) {
                System.out.println("Too low. Aim higher");
            } else if (guess > target) {
                System.out.println("Too high. Try lower");
            } else {
                System.out.println("You got it! The number was " + target + ". You're amazing!");
            }
        }

        s.close();
    }
}
