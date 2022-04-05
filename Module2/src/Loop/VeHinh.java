package Loop;

import java.util.Scanner;

public class VeHinh {
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
                System.out.println("***************");
                System.out.println("***************");
                System.out.println("***************");
                break;
            case 2:
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 3:
                System.out.println("**********");
                System.out.println("*********");
                System.out.println("********");
                System.out.println("*******");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            default:
                System.out.println("ko co lua chon");
        }
    }
}
