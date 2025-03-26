package BasicSortingAlgorithms;

public class CheckArrayIsSorted1 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        int n = arr.length;

        boolean flag = true;
        for(int i=0;i<n;i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Given array is sorted..");
        }
        else System.out.println("Given array is not sorted..");
    }
}
