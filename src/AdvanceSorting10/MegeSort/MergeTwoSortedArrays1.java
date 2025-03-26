package AdvanceSorting;

// Tc = O(m+n) where m is size of 1st array and n is the size of 2nd array
public class MergeTwoSortedArrays1 {

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a,int[] b, int[] res){
        int i=0,j=0,k = 0;

        while(i< a.length && j< b.length){
            if(a[i] <= b[j]){
                res[k++] = a[i++];
            }
            else res[k++] = b[j++];
        }
        while(i<a.length) res[k++] = a[i++];

        while(j<b.length) res[k++] = b[j++];

    }

    public static void main(String[] args) {
        int[] a = {10,30,50,60,80};
        int[] b = {20,40,70,75};

        print(a);
        print(b);

        int[] res = new int[a.length+b.length];

        merge(a,b,res);

        print(res);
    }
}
