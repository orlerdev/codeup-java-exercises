package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie movie = new Movie();

        while (true) {
            int userChoice = input.getInt("""
                                          What would you like to do?
                                          Press:
                                               0 -   Exit
                                               1 -   View all movies
                                               2 -   View movies in the Animated category
                                               3 -   View movies in the Drama category
                                               4 -   View movies in the Horror category
                                               5 -   View movies in the Sci-Fi category
                                               6 -   View movies in the Musical category
                                               7 -   View movies in a category of your choice
                                               8 -   Add a new movie
                                          """);
            if (userChoice == 0) {
                System.out.println("Thank you.");
                break;
            }

            switch(userChoice) {
                case 1 -> MoviesArray.printMovies();
                case 2 -> MoviesArray.printAnimatedMovies();
                case 3 -> MoviesArray.printDramaMovies();
                case 4 -> MoviesArray.printHorrorMovies();
                case 5 -> MoviesArray.printSciFiMovies();
                case 6 -> MoviesArray.printMusicalMovies();
                case 7 -> MoviesArray.printUserCategory();
                case 8 -> MoviesArray.addMovie();
            }

        }
    }



}
