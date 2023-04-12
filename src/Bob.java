import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter \"quit\" to end the conversation.");
        boolean quit = false;

        while (!quit) {
            System.out.println("Talk to Bob.");
            String userInput = scan.nextLine();
            String bobResponse = "";
            if (userInput.equalsIgnoreCase("quit")) {
                quit = true;
            } else if (userInput.endsWith("?")) {
                bobResponse = "Sure";
            } else if (userInput.endsWith("!")) {
                bobResponse = "Whoa, chill out!";
            } else if (userInput.isBlank()) {
                bobResponse = "Fine. Be that way!";
            } else {
                bobResponse = "Whatever";
            }
            System.out.printf(bobResponse);
            System.out.println("\n");
        }

    }
}
