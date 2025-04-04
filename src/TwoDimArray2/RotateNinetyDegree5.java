package TwoDimArray;

public class RotateNinetyDegree5 {

    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4,5 , 6},{7, 8, 9}};

        int m = arr.length, n = arr[0].length;

        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        // rotate - reverse each row

        for(int i=0;i<m;i++) {
            int low = 0, high = m - 1;
            // swap[i][low] with swap[i][high]

            while (low < high) {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;

            }
        }
        print(arr);


    }
}
