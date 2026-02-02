package SORTING;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        //taking an input
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        //Insertion sort code
        for(int i = 0 ; i <  n ; i++){
            int j = i ;
            while(j > 0 && arr[j-1 ] > arr[j] ){
                int temp =arr[j-1] ;
                arr[j-1] = arr[j] ;
                arr[j] = temp ;
                j-- ;
            }
        }

        System.out.print("Array after Sorting:- ");
        for(int i = 0 ; i< n; i++){
            System.out.print(  arr[i] + " ");
        }

    }
}
