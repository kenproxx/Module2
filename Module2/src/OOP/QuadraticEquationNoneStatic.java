package OOP;

import java.util.Scanner;

 class QuadraticEquationNoneStatic {
    double a, b, c;

    public QuadraticEquationNoneStatic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    double getRoot1() {
        double result = 0;
        if(getDiscriminant()>=0)
            result = ((-b - Math.sqrt(getDiscriminant())) / (2 * a));

        return result;

    }
    double getRoot2() {
        double result = 0;
        if(getDiscriminant()>=0)
            result = ((-b + Math.sqrt(getDiscriminant())) / (2 * a));

        return result;

    }

    public static void main(String[] args) {
        QuadraticEquationNoneStatic quadra = new QuadraticEquationNoneStatic(3, 5, 1);
        System.out.println(quadra.getRoot1()+ " " + quadra.getRoot2());
    }
}