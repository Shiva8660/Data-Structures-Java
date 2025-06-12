package Stack13.LeetCodeProblems;

public class nextGreaterElement4 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 3, 5};
        int[] newArr = new int[arr.length];
        int n = newArr.length;

        newArr[n-1] = -1;

        for (int i = 0; i < n-1; i++) {
            newArr[i] = -1;
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]){
                    newArr[i] = arr[j];
                    break;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+" ");
        }
     }
}
