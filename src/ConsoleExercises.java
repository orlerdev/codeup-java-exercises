import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %f%n", pi);
//        System.out.println("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println(userNumber);
//        System.out.println("Enter 3 words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("The three words are %s %s %s%n", word1, word2, word3);
//        System.out.println("Enter a sentence");
//        String userSentenceOne = scanner.next();
//        System.out.println("Enter a sentence");
//        String userSentenceTwo = scanner.nextLine();
//        System.out.printf("The first return was %s and the second return was %s", userSentenceOne, userSentenceTwo);
        System.out.println("Enter the length of a classroom at Codeup");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of a classroom at Codeup");
        int width = Integer.parseInt(scanner.nextLine());
        int perimeter = length*2 + width*2;
        System.out.printf("The perimeter of the room is %d", perimeter);

    }
}
