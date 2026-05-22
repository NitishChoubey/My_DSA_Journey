package RECURSION;

import java.util.Scanner;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

        int[] result = bubbleSort(arr , arr.length - 1, 0) ;
        for(int  i = 0  ; i < size ; i++){
            System.out.print(result[i] + " ");
        }


    }

    public static int[] bubbleSort(int[] arr , int row , int col) {

        if(row == 0){
            return arr;
        }
        if(row > col){
            if(arr[col] > arr[col + 1]){
                int temp = arr[col] ;
                arr[col] = arr[col + 1] ;
                arr[col + 1] = temp ;
            }

            return bubbleSort(arr , row  ,col +1) ;
        }else{
            return bubbleSort(arr, row-1 , 0) ;
        }
    }

}
