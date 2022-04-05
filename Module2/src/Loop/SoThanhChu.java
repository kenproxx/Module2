package Loop;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] arr = {
                "khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi"
        };
        int hi = num % 10;
        int a = num / 10;

        if(hi == 0 ){
            System.out.println(arr[a] + " muoi");
            return;
        }
        if(10 < num && num <= 20 ) {
            System.out.println(" muoi " + arr[hi]);
            return;
        }
        if(20 < num && num < 99){
            System.out.println(arr[a] + " muoi " + arr[hi]);
            return;
        }
        System.out.println(arr[num]);

        }
}
