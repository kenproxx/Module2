package Array;

public class MaxValue2Array {


    public static void main(String[] args) {
        int[][] arr = {
                {1,123,235,34,412134,456},
                {32,35,464,34,5,473452187,4,523,41},
                {7,45,63,4,22,345,56,4,52,34}
        };
        System.out.println(maxValue(arr));
    }
    static int maxValue(int[][] arr) {
        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (max < arr[i][j]) {
//                    max = arr[i][j];
//                }
//            }
//        }
        for (int[] a : arr) {
            for (int b : a) {
                if (max < b) {
                    max = b;
                }
            }
        }
        return max;
    }
}
