package AbstractClass.Resizeable;

public class Rectangle extends Shape {
    public Rectangle() {

    }

    public Rectangle(double h, double w) {
        super(h,w);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }

    public double getPerimeter() {
        return (super.getHeight() + super.getWidth()) * 2;
    }


}
