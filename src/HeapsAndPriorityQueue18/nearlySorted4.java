package HeapsAndPriorityQueue18;
import java.util.*;

class NearlySortedDriver {

    public static void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) {
                arr[idx++] = pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            arr[idx++] = pq.poll();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 3;
        nearlySorted(arr, k);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
