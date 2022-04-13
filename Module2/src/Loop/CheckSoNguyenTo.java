package Loop;

import Array.FindMinValue;

import java.util.Scanner;

public class CheckSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao mot so: ");
        int num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("day deu phai so nguyen to");
                break;
            } else {
                System.out.println("day la so nguyen to");
                break;
            }
        }
    }
}
