package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numA, numB, numC;
        System.out.println("nhap a");
        numA = scanner.nextDouble();
        System.out.println("nhap b");
        numB = scanner.nextDouble();
        System.out.println("nhap c");
        numC = scanner.nextDouble();
        getDiscriminant(numA,numB,numC);
    }
    static void getDiscriminant(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta >= 0) {
            System.out.println("phuong trinh co nghiem la: " +
                    getRoot1(delta, a, b) + " va " + getRoot2(delta, a, b));
        } else {
            System.out.println("phuong trinh vo nghiem");
        }

    }
     static double getRoot1(double delta, double a, double b) {
        double result = (double) ((-b - Math.sqrt(delta)) / (2 * a));
        return result;
    }

     static double getRoot2(double delta, double a, double b) {
        double result = (double) ((-b + Math.sqrt(delta)) / (2 * a));
        return result;
    }

}