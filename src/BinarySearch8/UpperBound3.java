package BinarySearch;

public class UpperBound3 {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,246};
        int n = arr.length;
        int target = 97;


        int lowerBound = n;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = low + (high - low )/2;
            if(arr[mid] > target){
                lowerBound = Math.min(lowerBound,mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }

        System.out.println("Lower bound is : "+lowerBound);
    }
}
