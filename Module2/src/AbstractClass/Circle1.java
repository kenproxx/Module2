package AbstractClass;

public class Circle1 {
    private double radius = 1;
    private String color = "red";
    private boolean filled;
    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    protected double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

}

