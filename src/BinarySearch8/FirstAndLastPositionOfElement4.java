package BinarySearch;

class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int n = arr.length;

        if (n <= 0) {
            return ans;
        }

        int low = 0, high = n - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        if (!flag) return ans;

        int lowerBound = n;
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        ans[0] = lowerBound;

        int upperBound = n;
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                upperBound = mid;
                high = mid - 1;
            } else low = mid + 1;
        }

        ans[1] = upperBound - 1;
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10, 10, 10, 20, 20, 20, 20, 40, 40, 50, 50, 50};
        int target = 20;
        int[] result = solution.searchRange(arr, target);

        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }
}
// leetcode 34