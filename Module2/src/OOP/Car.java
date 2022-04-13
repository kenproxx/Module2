package OOP;

public class Car {
    private String name, engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

}
class TestStaticProperty{
    public static void main(String[] args) {
        Car car1 = new Car("lamboghini", "v6");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Ferali", "v8");
        System.out.println(Car.numberOfCar);


    }
}
