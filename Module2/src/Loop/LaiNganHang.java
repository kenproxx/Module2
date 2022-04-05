package Loop;

import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so tien vay: ");
        int money = scanner.nextInt();
        System.out.print("nhap vao so thang vay: ");
        int month = scanner.nextInt();
        System.out.print("nhap vao phan tram: ");
        double phanTram = scanner.nextDouble();
        double tienLai = money * ((phanTram / 100 / 12) * month);
        System.out.println("tien lai la: " + tienLai);
    }
}
