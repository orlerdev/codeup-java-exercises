import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String userFirstName = scanner.nextLine();
        System.out.println("Enter you last name");
        String userLastName = scanner.nextLine();
        System.out.printf("The user's name is %s %s.%n", userFirstName, userLastName);
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();
        System.out.printf("The user's full name is %s.", fullName);
    }
}
