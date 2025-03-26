package BasicSortingAlgorithms;
import java.util.Arrays;

// using for loop you can display elements But you can't modify anything

public class TransformArray5 {
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        // output =>{3 , 0, 5, 2, 6, 4, 1}
        int n = arr.length;

        System.out.println(Arrays.toString(arr));

        int x = 0;
        for (int i = 0; i < n ; i++) { // till n-1 it should run
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = x ;
            x--;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
