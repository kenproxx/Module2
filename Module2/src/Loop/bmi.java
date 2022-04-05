package Loop;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao chieu cao: ");
        double height = input.nextDouble();
        System.out.print("nhap vao can nang: ");
        double weight = input.nextDouble();
        double bmi = weight / (height*height);
        if(30 <= bmi){
            System.out.println("obese");
        } else if (25 <= bmi){
            System.out.println("Overweight");
        } else if (18.5 <= bmi){
            System.out.println("Normal");
        } else if (bmi < 18.5){
            System.out.println("underWeight");
        }

    }
}
