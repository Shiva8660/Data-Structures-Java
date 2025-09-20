package BitManipulation23;

// User function Template for Java
class SetKthBit4 {

    // Method 1: Using loops and arrays
    static int setKthBitArrayMethod(int n, int k) {
        if(n == 0 && k == 0) return 1; // edge case

        int x = n;
        int[] tempArr = new int[32];
        int len = 0;

        // Convert n to binary (LSB first)
        while(x != 0){
            tempArr[len++] = x % 2;
            x = x / 2;
        }

        // If k >= number of bits, return -1
        if(k >= len) return -1;

        // Reverse array to have MSB at index 0
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = tempArr[len - 1 - i];
        }

        // Convert LSB-index k to MSB-index
        int msbIndex = len - 1 - k;
        arr[msbIndex] = 1;

        // Convert back to decimal
        int res = 0;
        for(int i = 0; i < len; i++){
            res = res * 2 + arr[i];
        }

        return res;
    }

    // Method 2: Using bitwise operators (simpler and faster)
    static int setKthBitBitwise(int n, int k) {
        return n | (1 << k);
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        int res1 = setKthBitArrayMethod(n, k);
        System.out.println("Array method result: " + res1); // Output: 14

        int res2 = setKthBitBitwise(n, k);
        System.out.println("Bitwise method result: " + res2); // Output: 14
    }
}

