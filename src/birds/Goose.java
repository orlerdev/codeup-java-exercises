package birds;
public class Goose extends Bird{
    public Goose(String name) {
        super(name);
    }
    public void makeNoise(String noise) {
        System.out.printf("%s goes %s%n", getName(), noise);
    }
}
