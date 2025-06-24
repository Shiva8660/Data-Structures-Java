package Queue14.LeetCode;

import java.util.*;

public class SlidingWindowMax5 {
    public static void main(String[] args) {
        SlidingWindowProcessor processor = new SlidingWindowProcessor();
        int[] numbers = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;

        int[] result = processor.findMaxInWindows(numbers, windowSize);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

class SlidingWindowProcessor {
    public int[] findMaxInWindows(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[index++] = nums[deque.peek()];
            }
        }
        return result;
    }
}

