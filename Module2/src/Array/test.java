package Array;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu " + (i + 1));
            int num = scanner.nextInt();
            arr[i] = num;
        }
        System.out.println("tong cac phan tu chan la: " + sum(arr));
        System.out.println("nhap vao so muon tim de");
        n = scanner.nextInt();
        searchA(n, arr);

//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 == 0) {
//                sum += arr[i];
//            }
//
//        }
//        System.out.println("tong cac phan tu chan la: " + sum);
//        System.out.println("nhap vao 'a', tao tim cho:");
//        int num = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//             num = scanner.nextInt();
//            if (num == arr[i]) {
//                System.out.println("so " + num + " o vi tri " + i);
//                break;
//            } else {
//                System.out.println("khong co, so khac di");
//            }
//        }
//        System.out.println("nhap vao mot so muon xoa");
//        int so = scanner.nextInt();
//        int count = 0;
//        int[] arr2 = new int[n-1];
//        for (int i = 0; i < n; i++) {
//            if (so == arr[i]) {
//                for (int j = 0; j < i; j++) {
//                    arr2[j] = arr[j];
//                }
//                for (int j = i; j < arr.length ; j++) {
//                    arr2[j] = arr[j -1];
//                }
//                for (int a: arr2
//                     ) {
//                    System.out.println(arr2);
//                }
//            } else {
//                System.out.println("khong co, so khac di");
//                so = scanner.nextInt();
//            }
//        } {
//
//        }
//
//    }

    }
    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void searchA(int a, int[] arr){
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                check = true;
            }
        }
        if (check) {
            System.out.println("so " + a + " vi tri " + i);
        }

    }

}


