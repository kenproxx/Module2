package AbstractClass.Resizeable;

public class Square extends Shape implements Resize{
    public Square() {

    }
    public Square(double h) {
        super(h,h);
    }
    @Override
    public double getArea() {
        return super.getHeight() * super.getHeight();
    }

    @Override
    public double getPerimeter() {
        return super.getHeight() * 4;
    }

}
