package Queue14.LeetCode;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DeckOrderRevealer7 {
    public static void main(String[] args) {
        DeckProcessor processor = new DeckProcessor();
        int[] deck = {17, 13, 11, 2, 3, 5, 7};
        int[] result = processor.revealDeckInIncreasingOrder(deck);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class DeckProcessor {
    public int[] revealDeckInIncreasingOrder(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }

        return result;
    }
}

