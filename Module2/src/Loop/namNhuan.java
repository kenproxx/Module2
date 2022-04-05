package Loop;

import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        boolean namNhuan = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so nam: ");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }
        if(namNhuan){
            System.out.println("nam nay la nam nhuan");
        } else {
            System.out.println("nam nay khong la nam nhuan");

        }
    }
}
