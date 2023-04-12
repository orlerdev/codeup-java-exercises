public class StringExercise {
    public static void main(String[] args) {
        String string = "We don't need no education\nWe don't need no thought control";
        System.out.println(string);

        String altString = """
                We don't need no education
                We don't need no thought control
                """;

        System.out.println(altString);

        String string2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(string2);

        String string3 = "In windows, the main drive is usually C:\\";
        System.out.println(string3);

        String string5 = """
                I can do backslashes \\, double backslashes \\\\,
                and the amazing triple backslash \\\\\\!
                """;
        System.out.println(string5);

        String string4 = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(string4);
    }
}
