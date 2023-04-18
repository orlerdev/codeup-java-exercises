package shapes;
abstract public class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }
    abstract void setLength(double length);

    public double getWidth() {
        return width;
    }
    abstract void setWidth(double width);


    public Quadrilateral(){}
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }


}
