package Array;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {12,45,23,42,345,46,4,234,356};
        int[] arr2 = {4,23,546,23,446,34,13};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        for (int a :
                arr3) {            System.out.print(a + "\t");
        }
    }
}
