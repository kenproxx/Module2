package Loop;

import java.util.Scanner;

public class dienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("S chu nhat la: " + a * b);
        System.out.println("C chu nhat la: " + (a + b) * 2);
    }
}
