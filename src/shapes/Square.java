package shapes;
public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return 4 * side;
    }

    @Override
    public double getPerimeter() {
        return side * side;
    }
}
