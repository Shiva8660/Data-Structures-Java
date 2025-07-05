package HeapsAndPriorityQueue18;

import java.util.*;

public class RopeMergingCostCalculator5 {

    public static int calculateMinimumCost(int[] ropeLengths) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = ropeLengths.length;
        if (n < 2) return 0;

        int totalCost = 0;

        for (int length : ropeLengths) pq.add(length);

        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();

            int merged = first + second;
            totalCost += merged;

            pq.add(merged);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        int result = calculateMinimumCost(ropes);
        System.out.println("Minimum cost to connect all ropes: " + result);
    }
}
