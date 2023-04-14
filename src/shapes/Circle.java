package shapes;
public class Circle {
    private double radius;
    private double area;
    private double circumference;
    public static int totalCircles = 1;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public Circle() {
        totalCircles++;
    };
    public Circle(double radius, double area, double circumference) {
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }

    public double getArea(double radius) {
        return Math.PI * Math.pow(2, radius);
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        System.out.printf("""
                          The circumference of the circle is: %.2f.
                          The area of the circle is: %.2f.
                          """, getCircumference(radius), getArea(radius));
    }

}
