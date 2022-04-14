package AbstractClass.Resizeable;

public class Circle extends Shape {
    private double radius = 1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return getRadius() * getRadius() * 3.14;
    }

    public double getPerimeter() {
        return radius * 2 * 3.14;
    }


}
