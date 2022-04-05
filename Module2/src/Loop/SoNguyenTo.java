package Loop;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so luong:");
        int dem = scanner.nextInt();
        int count = 1;
        for (int i = 3; ; i++) {
            flag = true;
            for (int j = 2; j < i  ; j++) {
                if(i % j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.print("so thu: " + count + " la " + i);
                System.out.println("");
                count++;
            }
            if (count >= dem) {
                break;
            }
        }
    }
}
