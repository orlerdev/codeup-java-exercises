package shapes;
public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter(){
        return 4 * this.length;
    }

    public double getArea(){
        return Math.pow(this.width, 2);
    }

}
