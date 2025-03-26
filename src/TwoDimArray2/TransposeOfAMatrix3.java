package TwoDimArray;

public class TransposeOfAMatrix3 {
    public static void main(String[] args) {
        int[][] a = {{1, 2},{3, 4},{5, 6}};


        int m = a.length, n = a[0].length;
//        for (int i = 0; i < m; i++) { // rows
//            for (int j = 0; j < n; j++) { // cols
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        // column wise printing
//        for (int j = 0; j < n; j++) { // cols
//            for (int i = 0; i < m; i++) { // rows
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        // if you want to store elements in new array change columns to rows
         int[][] transpose = new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = a[j][i];
                System.out.print(transpose[i][j] + " ");
            }
             System.out.println();
        }


    }

}

