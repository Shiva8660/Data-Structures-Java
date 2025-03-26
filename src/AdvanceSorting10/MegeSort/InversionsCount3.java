package AdvanceSorting;


public class InversionsCount3 {

    static int count = 0;

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // no need to write this function
//    public static void countInversions(int[] a, int[] b){
//        int i=0 ,j=0;
//
//        while(i < a.length && j<b.length){
//            if(a[i] > b[j]){
//                count += (a.length-i);
//                j++;
//            }
//            else i++;
//        }
//    }

    public static void merge(int[] a,int[] b, int[] res){
        int i=0,j=0,k = 0;

        while(i< a.length && j< b.length){
            if(a[i] <= b[j]){
                res[k++] = a[i++];
            }
            else {
                res[k++] = b[j++];
                count += (a.length-i);

            }
        }

        while(i<a.length) res[k++] = a[i++];

        while(j<b.length) res[k++] = b[j++];

    }

    public static void mergeSort(int[] arr){
        int n = arr.length;

        if(n==1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i <(n-n/2); i++) {
            b[i] = arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);

//        countInversions(a,b);

        merge(a,b,arr);

        a = null; b = null;


    }

    // leetcode - 493
    public static void main(String[] args) {
        int[] arr = {80,30,50,20,60,10,70,40};

        print(arr);
        mergeSort(arr);
        print(arr);

        System.out.println(count);

    }
}

