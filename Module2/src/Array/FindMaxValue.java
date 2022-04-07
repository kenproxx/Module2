package Array;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {1,123,245,34,567,4,12,3,546,34,12,31,63,56};
        System.out.println("tim max nhe: ");
        int max = 0;
        for (int num :
                arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("max la: " + max);
    }
}
