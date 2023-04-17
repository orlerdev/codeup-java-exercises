package birds;
public class Quaker extends Bird {
    public Quaker(String name) {
        super(name);
    }
    public void makeNoise(){
        System.out.printf("%s goes ack-squeak%n", getName());
    }

}
