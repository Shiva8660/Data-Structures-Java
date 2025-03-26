package TwoDimArray;

public class AddTwoMatrices2 {
    public static void main(String[] args) {
        int[][] a = {{1, 3},{5, 7}};
        int[][] b = {{2, 4},{6, 8}};

        // rows and columns should be same
//        int[][] res = new int[2][2];
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                res[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        System.out.println("After addition the matrix look like ");
//        for(int[] ele : res) {
//            for (int x : ele) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
 //       }

        // without extra array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

