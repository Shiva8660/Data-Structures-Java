package HeapsAndPriorityQueue18;
import java.util.Scanner;
import java.util.*;



class findKthSmallest3 {

    // 1st method
//    public static int findKthSmallest(int[] arr, int k) {
//        Arrays.sort(arr);
//        return arr[k - 1];
//    }

    // 2nd method -> waste of time
//    public static int findKthSmallest(int[] arr, int k) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        // for this -> TC = O(Nlogn)
//        for (int i = 0; i < arr.length; i++) {
//            pq.add(arr[i]);
//        }
//
         // for this -> Overall TC = O(klogn)
//        int data = 0;
//        while(k != 0){
//            data = pq.remove();
//            k--;
//        }
//        return data;
//    }
// overall for this TC = O(nlogn)  -> which is worst -> rather built is better

    // 3rd method
    // TC = O(nlogk) -> where k is size of heap -> better
    public static int findKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // In this I am removing n-k top elements then you return peek you will get your answer
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 2, 8, 3, -6, -2, 9, -12};

        int k = 3;
        int result = findKthSmallest(numbers, k);
        System.out.println(result);
    }
}
