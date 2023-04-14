package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter a radius to create a circle");
        Circle circle = new Circle(radius);
        while (true) {
            if (!input.yesNo("Would you like to make another circle?")) {
                System.out.printf("You created %d circles", Circle.totalCircles);
                break;
            }
            double circleRadius = input.getDouble("Enter the radius of your circle.");
            Circle nextCircle = new Circle();
            System.out.printf("""
                              The circumference of the circle is: %.2f.
                              The area of the circle is: %.2f.
                              """, nextCircle.getCircumference(circleRadius), nextCircle.getArea(circleRadius));
        }

    }
}
