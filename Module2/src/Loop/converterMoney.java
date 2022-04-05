package Loop;

import java.util.Scanner;

public class converterMoney {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.print("nhap vao USD: ");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        System.out.println("vnd: " + usd * rate);
    }


}
