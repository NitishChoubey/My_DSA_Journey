package SORTING;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n];

        //taking input
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //code for bubble sort
        for(int i = n-1 ; i >=1 ; i--){
            int didSwap = 0 ;
            for(int j = 0 ; j<= i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    didSwap = 1 ;
                }
            }
            if(didSwap == 0){
                break;
            }
        }

        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
