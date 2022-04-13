package Array;

public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = {123, 456, 23, 23, 41, 24, -234, -5534, 123, 4, 546, 23};
        System.out.println("min arr la: " + findMin(arr));
    }
    public static int findMin(int[] arr) {
        int min = 0;
        for (int num :
                arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
