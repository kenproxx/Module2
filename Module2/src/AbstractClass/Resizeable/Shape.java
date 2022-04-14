package AbstractClass.Resizeable;

public abstract class Shape {
    private double height, width;

    public Shape() {

    }

    public Shape( double h,double w) {
        height = h;
        width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        width = w;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
