package miniExercises;
public class Animals {
    public static void main(String[] args) {
        Cat Jasper = new Cat();
        Jasper.setName("Jasper");
        Jasper.setQuote(Quote.randomQuote());
        Jasper.makeNoise();

        Cat Bojangles = new Cat("Bojangles", Quote.randomQuote());
        Bojangles.makeNoise();

    }

}
