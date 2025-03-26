package arrays;


public class LinearSearch0 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 15};
        int x = 8;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + x + " found at index: " + index);
        } else {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
}
