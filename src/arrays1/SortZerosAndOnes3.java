package arrays;

public class SortZerosAndOnes3 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,0,1,1,1};
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[count++] = 0;
            }
        }
        while(count<arr.length){
            arr[count++] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
