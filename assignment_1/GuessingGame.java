import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 27;
        boolean guessed = false;

        for (int i = 0; i < 5; i++) {
            if (!sc.hasNextInt())
                break;
            int guess = sc.nextInt();
            if (guess < secret) {
                System.out.println("Too Low");
            } else if (guess > secret) {
                System.out.println("Too High");
            } else {
                System.out.println("Congratulations! You guessed it.");
                guessed = true;
                break;
            }
        }

        if (!guessed)
            System.out.println("Better Luck Next Time!");
    }
}
