package miniExercises;
public class Cat {
    private String name;
    private String quote = Quote.randomQuote();

    public Cat() {}
    ;

    public Cat(String name, String quote) {
        this.name = name;
        this.quote = quote;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuote() {
        return quote;
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }
    public void makeNoise() {
        System.out.printf("%s says %s%n", name, quote);
    }
}
