package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Measurable myShape2;

        myShape = new Rectangle(5, 6);
        myShape2 = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());

    }
}