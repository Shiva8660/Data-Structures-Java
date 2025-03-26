package BinarySearch;

public class Search1 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,8,9};
        int target = 9;

        int low = 0, high = arr.length-1;

        boolean flag = false;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                flag = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        if(flag) System.out.println("Searching is done !");
        else System.out.println("No matches !");

    }
}
