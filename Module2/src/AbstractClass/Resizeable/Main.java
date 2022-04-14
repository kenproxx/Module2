package AbstractClass.Resizeable;

public class Main {
    public static void main(String[] args) {
        double randomSize =  Math.floor(Math.random() * 100 + 1);
        System.out.println(randomSize);
        Circle circle1 = new Circle(5);
        Rectangle rectangle = new Rectangle(3,6);
        Square square1 = new Square(7);
        System.out.println("dien tich hinh tron la: " + circle1.getArea());
        System.out.println("dien tich hinh vuong la: " + square1.getArea());
        System.out.println("dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println("-------------------------------");
        System.out.println("auto resize");
        circle1.setRadius(randomSize);
        rectangle.setHeight(randomSize);
        rectangle.setWidth(randomSize);
        square1.setHeight(randomSize);
        System.out.println("dien tich hinh tron la: " + circle1.getArea());
        System.out.println("dien tich hinh vuong la: " + square1.getArea());
        System.out.println("dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println("-------------------------------");
    }
}
