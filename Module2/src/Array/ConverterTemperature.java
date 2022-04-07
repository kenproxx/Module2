package Array;

import java.util.Scanner;

public class ConverterTemperature {
    public static void main(String[] args) {
        System.out.println("menu:");
        System.out.println("1. C to F");
        System.out.println("2. F to C");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();

        double tempC, tempF;
        switch (in) {
            case 1:
                System.out.println("nhap vao nhiet do (do C)");
                tempC = input.nextDouble();
                tempF = tempC * 9 / 5 + 32;
                System.out.println(tempC + " do C la " + tempF + " do F");
                break;
            case 2:
                System.out.println("nhap vao nhiet do (do F)");
                tempF = input.nextDouble();
                tempC = (tempF - 32) * 5 / 9;
                System.out.println(tempF + " do F la " + tempC + " do C");
                break;
            default: break;
        }
    }
}
