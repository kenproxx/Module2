package Loop;

public class timMax {
    public static void main(String[] args) {
        int[] arr = {1,24,34,53,4,4546,234,123};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}
