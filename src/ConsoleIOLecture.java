public class ConsoleIOLecture {

    public static void main(String[] args) {
        String cohort = "Bigfoot";
        int week = 9;
        System.out.printf("Hello, %s!%n", cohort);
        System.out.print("This string will reside on a new line in the console");
        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        System.out.print("This string will reside on a new line in the console");
        float myFloat = 123.456F;
        System.out.printf("The number is %.2f%n", myFloat);
        System.out.printf("The number is %11.2f%n", myFloat);
        System.out.printf("The number is %011.2f%n", myFloat);
        System.out.printf("The number is %-11.2f%n", myFloat);
        System.out.print("This string will reside on a new line in the console");
    }}
