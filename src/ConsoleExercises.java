import java.util.Scanner;
import java.util.StringTokenizer;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
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
//        System.out.println("Enter the length of a classroom at Codeup");
//        int length = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter the width of a classroom at Codeup");
//        int width = Integer.parseInt(scanner.nextLine());
//        int perimeter = length*2 + width*2;
//        System.out.printf("The perimeter of the room is %d", perimeter);

//        System.out.println("Enter your favorite quote");
//        String favoriteQuote = scanner.nextLine();
//        System.out.printf("The user's quote is: %s.%n", favoriteQuote);
//        System.out.println("How many words are in your quote?");
//        int numberOfWords = scanner.nextInt();
//        System.out.printf("The user says that there are %d words in their quote.%n", numberOfWords);
//        int actualNumberFirst = numberOfWordsSplit(favoriteQuote);
//        int actualNumberSecond = numberOfWordsTokenizer(favoriteQuote);
//        int actualNumberThird = noUtilsCount(favoriteQuote);
//        System.out.printf("Using .split() returns %d words.%n", actualNumberFirst);
//        System.out.printf("Using StringTokenizer returns %d words.%n", actualNumberSecond);
//        System.out.printf("Using only loops returns %d words.%n", actualNumberThird);

//        System.out.println("Enter your top three favorite foods, separating them by spaces.");
//        String foodOne = scanner.next();
//        String foodTwo = scanner.next();
//        String foodThree = scanner.next();
//        System.out.printf("1. %s%n2. %s%n3. %s%n", foodOne, foodTwo, foodThree);

        System.out.println("Enter a grocery list of three items only separating them by commas, no spaces.");
        scanner.useDelimiter(",");
        String userList = scanner.nextLine();
        System.out.println(userList);

    }

    public static int numberOfWordsSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static int numberOfWordsTokenizer(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(input);
        return tokens.countTokens();

    }

    public static int noUtilsCount(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        int wordCount = 0;

        boolean isAWord = false;
        int endOfWords = input.length() - 1;
        char[] characters = input.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfWords) {
                isAWord = true;
            } else if (!Character.isLetter(characters[i]) && isAWord) {
                wordCount++;
                isAWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfWords) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
