package arrays;

public class LargeThreeElement12 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11, 6, 1, 11, 8};
        solve(arr);

     }

    public static void solve(int[] arr) {
        int n = arr.length;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // If you don't want same element then remove equal sign
        for(int i=0;i<n;i++){
            if(first <= arr[i]){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(second <= arr[i]){
                third = second;
                second = arr[i];
            }
            else if(third <= arr[i]){
                third = arr[i];
            }
        }
        System.out.println("1St largest : " + first + "\n2nd largest : " + second + "\n3rd largest " + third);


    }
}
