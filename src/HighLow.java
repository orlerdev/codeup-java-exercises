import java.lang.invoke.MethodHandle;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = MethodsExercises.randomNumber(1, 100);
        int maxAttempts = 5;
        int count = 0;
        for (int i = count; i <= maxAttempts; i++) {
            if (i == maxAttempts) {
                System.out.printf("No tries left. The correct number was %d", randomNum);
                break;
            }
            int userGuess = MethodsExercises.getInteger(1, 100);
            if (userGuess == randomNum) {
                System.out.printf("GOOD GUESS! You guessed the number in %s", i == 1 ? "try" : "tries");
                break;
            } else if (userGuess < randomNum) {
                System.out.println("HIGHER");

            } else {
                System.out.println("LOWER");

            }
        }

    }

}
