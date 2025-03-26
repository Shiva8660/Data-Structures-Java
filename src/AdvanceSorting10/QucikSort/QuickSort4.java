package AdvanceSorting;

import java.util.*;


// this is shoeb's sir code

public class QuickSort4 {
    static int nSwap = 0, comp = 0;

    static void swap(int[] arr,int i,int j){
        if(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            nSwap++;
        }
    }

    static int partition(int[] arr,int p,int q){
        int x = arr[p];
        int i = p;

        for(int j=p+1;j<=q;j++){
            comp++;
            if(arr[j] <= x){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i,p);
        return i;
    }

    static void quickSort(int[] arr,int p,int q){
        if(p<q){
            int m = partition(arr,p,q);
            quickSort(arr,p,m-1);
            quickSort(arr,m+1,q);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("-1");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,n-1);

        System.out.println("The number of comparison is :"+comp);
        System.out.println("The number of swapping : "+nSwap);

        System.out.println("The sorted array is : ");
        for(int j:arr){
            System.out.print(j+" ");
        }

    }
}
