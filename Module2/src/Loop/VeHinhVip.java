package Loop;

import java.util.Scanner;

public class VeHinhVip {
    public static void main(String[] args) {
        System.out.println("menu");
        System.out.println("1. ve hinh chu nhat");
        System.out.println("2. ve hinh vuong");
        System.out.println("3. ve hinh tam giac");
        Scanner input = new Scanner(System.in);
        System.out.println("ban thich hinh nao: ");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("nhap vao chieu rong");
                int height = input.nextInt();
                System.out.println("nhap vao chieu dai");
                int weight = input.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < weight; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("nhap vao mot canh");
                height = input.nextInt();
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("nhap vao canh tren");
                height = input.nextInt();
                System.out.println("nhap vao canh phai");
                weight = input.nextInt();
                for (int i = weight; i > 0; ) {
                    for (int j = height; j > 0 ; ) {
                        System.out.print("*");
                        --j;
                    }
                    System.out.println("");
                    --i;
                }
                break;
        }
    }
}
