package birds;
public class BirdShelter {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Finch("Finch");
        birds[1] = new Goose("Goose");
        birds[2] = new Quaker("Quaker");

        for(Bird bird : birds){
            bird.makeNoise();
        }
    }
}
