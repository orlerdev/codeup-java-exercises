package birds;
public class BirdTest {
    public static void main(String[] args) {
        Quaker quaker = new Quaker("Quaker");
        Finch finch = new Finch("Finch");
        Goose goose = new Goose("Goose");
        quaker.makeNoise();
        finch.makeNoise();
        goose.makeNoise("honk");

    }
}
