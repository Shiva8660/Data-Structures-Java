package BitManipulation23;

import java.util.Scanner;

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        String str = "";

        // Build binary string
        while (n != 0) {
            str += n % 2;
            n = n / 2;
        }

        // Reverse to get correct binary
        String reversed = new StringBuilder(str).reverse().toString();
        int len = reversed.length();
        int[] arr = new int[len];

        // ✅ Proper conversion from char to int
        for (int i = 0; i < len; i++) {
            arr[i] = Character.getNumericValue(reversed.charAt(i));
        }

        // If k is outside available bits → false
        if (k >= len) {
            return false;
        }

        // Otherwise check kth bit
        return arr[k] == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number
        int k = sc.nextInt(); // bit position

        System.out.println(checkKthBit(n, k));
    }
}

