package AbstractClass;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataCreated;

    protected GeometricObject() {

    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDataCreated() {
        return this.dataCreated;
    }

    public String toString() {
        return "color: " + color + ", filled: " + isFilled() + ", date: " + getDataCreated();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Rectangle extends GeometricObject {
    protected double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

}


