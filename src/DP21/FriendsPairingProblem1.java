package DP21;
//
//import java.util.Scanner;
//
//public class FriendsPairingProblem1 {
//
//    static class FriendsPairCounter {
//
//        public static int countPairings(int n) {
//            if (n <= 2) return n;
//            if (n == 3) return 4;
//            return countPairings(n - 1) + (n - 1) * countPairings(n - 2);
//        }
//
//        public long totalWaysToPair(int n) {
//            return countPairings(n);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numberOfFriends = scanner.nextInt();
//        FriendsPairCounter counter = new FriendsPairCounter();
//        System.out.println(counter.totalWaysToPair(numberOfFriends));
//    }
//}

// now using dp
import java.util.Scanner;
import java.util.Arrays;

public class FriendsPairingProblem1 {

    static class FriendsPairCounter {
        public static int pairing(int n, int[] dp) {
            if (n <= 2) return n;
            if (n == 3) return 4;

            if (dp[n] != -1) return dp[n];
            return dp[n] = (pairing(n - 1, dp) + (n - 1) * pairing(n - 2, dp));
        }

        public long countFriendsPairings(int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return pairing(n, dp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFriends = scanner.nextInt();
        FriendsPairCounter counter = new FriendsPairCounter();
        System.out.println(counter.countFriendsPairings(numberOfFriends));
    }
}


