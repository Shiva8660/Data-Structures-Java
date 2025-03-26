package BasicSortingAlgorithms;

public class BubbleSort2 {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,-3,8,10};
        int n = arr.length;



        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;;
        }

        System.out.println("Array is after sorting ..");
        print(arr);
    }
}
