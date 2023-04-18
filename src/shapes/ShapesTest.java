package shapes;
import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(4, 5);
        Measurable myShape2 = new Square();

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}
