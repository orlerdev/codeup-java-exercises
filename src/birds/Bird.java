package birds;
public class Bird {
    private String name;

    public Bird() {}
    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.printf("%s goes tweet-tweet%n", getName());
    }
}
