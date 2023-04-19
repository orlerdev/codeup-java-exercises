package shapes;
public class Square extends Quadrilateral {

    public Square() {}
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public void setLength(double length) {
        super.length = length;
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
    }
}
