package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao N: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu: " + i);
            int m = scanner.nextInt();
            arr[i] = m;
        }
        for (int a :
                arr) {
            System.out.print(a + "\t");
        }
        System.out.println("");
        System.out.println("dao nguoc mang cho ma xem ne:");
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        BaiTap.displayArray(arr2);
    }
}