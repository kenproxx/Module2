package Loop;

import java.util.Scanner;

public class phuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            System.out.println("phuong trinh co nghiem la: " +  -b/a);
        }
    }
}
