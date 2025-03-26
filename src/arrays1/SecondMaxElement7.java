package arrays;

public class SecondMaxElement7 {
    public static void main(String[] args) {

        int[] arr = {1, 99, 50, 4, 8, 33};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax)
            {
                secondMax = arr[i];
            }
        }
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second largest element in the array: " + secondMax);
        } else {
            System.out.println("No second largest element found in the array.");
        }
    }
}
