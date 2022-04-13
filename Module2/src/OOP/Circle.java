package OOP;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

}

