import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        DecimalFormat numberFormat = new DecimalFormat("#.##");
//        System.out.println(numberFormat.format(addition(8, 6)));
//        System.out.println(numberFormat.format(subtraction(8, 6)));
//        System.out.println(numberFormat.format(multiplication(8, 6)));
//        System.out.println(numberFormat.format(division(8, 6)));
//        System.out.println(numberFormat.format(modulo(8, 6)));
//        System.out.println(getInteger(1, 10));
//        int userInput = getInteger(1, 10);
//        System.out.println("Would you like to continue? Y/N?.");
//        String userResponse = scan.nextLine();
//        if (userResponse.equalsIgnoreCase("y")) {
//            long factorial = factorial(userInput);
//            System.out.println(factorial);
//        } else {
//            System.out.println("The user does not want to continue");
//        }

        System.out.println("Enter the number of side your die will have.");
        int numberOfSides = scan.nextInt();
        System.out.println("Do You Want to Roll the dice? Y/N?");
        Scanner input = new Scanner(System.in);
        String cont = input.nextLine();
        if (cont.equalsIgnoreCase("y")) {
            input.close();
        rollTheDice(numberOfSides);
        } else {
            System.out.println("The user does not want to play the game.");
        }
        scan.close();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scan.nextInt();
        if (userInput > 0 && userInput <= max) {
            return userInput;
        }
        return getInteger(min, max);
    }

    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return (long) factorial;
    }

    public static int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void rollTheDice(int num) {
        int die1 = randomNumber(1, num);
        int die2 = randomNumber(1, num);
        System.out.printf("You rolled a %d and a %d.", die1, die2);
    }

}

