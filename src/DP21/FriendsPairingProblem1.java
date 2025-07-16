package DP21;

import java.util.Scanner;

public class FriendsPairingProblem1 {

    static class FriendsPairCounter {

        public static int countPairings(int n) {
            if (n <= 2) return n;
            if (n == 3) return 4;
            return countPairings(n - 1) + (n - 1) * countPairings(n - 2);
        }

        public long totalWaysToPair(int n) {
            return countPairings(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFriends = scanner.nextInt();
        FriendsPairCounter counter = new FriendsPairCounter();
        System.out.println(counter.totalWaysToPair(numberOfFriends));
    }
}

