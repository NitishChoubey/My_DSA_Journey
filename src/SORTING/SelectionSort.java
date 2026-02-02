package SORTING;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        //taking input
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        //code for selection sort

        for(int i = 0 ; i<= arr.length-2 ; i++){
            int min = i ;
            for(int j = i ; j<= n-1 ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] = temp;
        }
        System.out.print("Array after Sorting:- ");
        for(int i = 0 ; i< n; i++){
            System.out.print(  arr[i] + " ");
        }

    }
}
