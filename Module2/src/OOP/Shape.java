package OOP;

public abstract class  Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled()? "filled" : "not filled") ;
    }
}

class Circle1 extends Shape {
    private double radius;

    public Circle1() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + getRadius()+ " , which is a subclass of /" + super.toString();
    }

}

class Cylinder extends Circle1 {
    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double x) {
        this.height = x;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + this.height);
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}


class Retangle1 extends Shape {
    private double width, length;

    public Retangle1() {
        width = 1;
        length = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() +
                ", which is a subclass of " + super.toString();

    }

}

class Square extends Retangle1 {
    private double side;

    public Square() {
        super.setLength(1);
        super.setWidth(1);
    }

    public Square(int side) {

    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    public void setLength(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A Square with side = " + this.side + ", which is a subclass of " + super.toString();
    }
}

class Triangle extends Shape{
    private double side1 = 1, side2 = 1, side3 = 1;

    public Triangle() {

    }

    public Triangle(double x, double y, double z) {
        this.side1 = x;
        this.side2 = y;
        this.side3 = z;
    }

    public double getArea() {
        double p = 0.5 * getPerimeter();
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "tam giac co dien tich la: " + getArea() + " co chu vi la: " + getPerimeter();
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
}}

