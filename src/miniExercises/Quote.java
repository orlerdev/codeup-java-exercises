package miniExercises;
public class Quote {
    public static String randomQuote() {
        int randomNumber = (int) (Math.random() * 4) + 1;

        switch (randomNumber) {
            case 1 -> {
                return """
                        Work like there's someone working 24 hours a day to take it away from you.
                        """;
            }
            case 2 -> {
                return """
                        The best time to plant a tree was 20 years ago. The second best time is now.
                        """;
            }
            case 3 -> {
                return """
                        When I'm in a slump, I comfort myself by saying if I believe in dinosaurs, then somewhere, they must be believing in me. And if they believe in me, then I can believe in me. Then I bust out.
                        """;
            }
            case 4 -> {
                return """
                        Look to the stars, but keep your feet on the ground.
                        """;
            }
        }

        return null;
    }
}
