import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercise 1: Loop Basics

        // a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // b. Do While
//        int num = 0;
//        do {
//            System.out.printf("%d%n", num);
//            num+=2;
//        } while (num < 101);

//        int num = 100;
//        do {
//            System.out.printf("%d%n", num);
//            num -= 5;
//        } while (num > -11);

//        long num = 2;
//        do {
//            System.out.printf("%d%n", num);
//            num *= num;
//        } while (num < 100000);
//
        // c. For
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        for (int i = 100; i >= -10; i--) {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // Exercise 2: Fizzbuzz

//        int num = 1;
//        while(num < 100) {
//            if(num % 3 == 0 && num % 5 == 0) {
//                System.out.println("FizzBuzz");
//                num++;
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//                num++;
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//                num++;
//            } else {
//                System.out.println(num);
//                num++;
//            }
//        }

        // Exercise 3: Display a table of powers
//        System.out.println("Enter an integer.");
//        int userInt = scanner.nextInt();
//        System.out.println("Would you like to continue? y/n");
//        String userResponse = scanner.next();
//        boolean consent = false;
//        if (userResponse.equals("y")) {
//            System.out.println("number " + "|" + " squared " + "|" + " cubed");
//            System.out.println("------ " + "|" + " ------- " + "|" + " ------");
//            for(int i = 1; i<= userInt; i++) {
//                System.out.printf("%d" + "      |" + " %d" + "       |" + " %d%n", i, i * i, i * i * i);
//        }
//            } else {
//            System.out.println("The user did not want to continue.");
//        }

        // Exercise 4: Convert given number grades into letter grades
        System.out.println("Enter a grade from 0 to 100");
        int userGrade = scanner.nextInt();
        System.out.println("Would you like to continue? y/n");
        String userResponse = scanner.next();
        if (userGrade > 87 && userGrade < 101) {
            System.out.println("A");
        } else if (userGrade < 88 && userGrade > 79) {
            System.out.println("B");
        } else if (userGrade < 80 && userGrade > 66) {
            System.out.println("C");
        } else if (userGrade < 67 && userGrade > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
