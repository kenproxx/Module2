package AbstractClass;

public abstract class Animal {
    public abstract String makeSound();

}

 class Tiger extends Animal {
    public String makeSound() {
        return "grouuuuuuuuuu";
    }
}

 class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "cuc cuc cuc....... cuc cut";
    }

    public String howToEat() {
        return "KFC";
    }
}

abstract class Fruit implements Edible {
    public String howToEat() {
        return "fruit juice";
    }
}

class Orange extends Fruit {

}

class Apple extends Fruit {

}

class RunClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }

}

