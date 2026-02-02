package BinarySearch;

import java.util.Scanner;

public class BinarySearchRecursiveCode {
    public static int binarySearch(int[] arr , int low , int high , int target){
        if(low > high) {
            return -1 ;
        }
        int mid = (low + high)/2 ;
        if(arr[mid] == target){
            return mid ;
        }
        else if(target > arr[mid]){
            return binarySearch(arr , mid +  1 , high ,target);
        }
        else{
            return binarySearch(arr , low , mid-1 ,target) ;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an arrayy:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ;i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter your target element:- ");
        int target = sc.nextInt() ;

        int index = binarySearch(arr , 0 , size-1 , target);

        if(index== -1){
            System.out.println("Target Element is not present");
        }else{
            System.out.println("Target Element is present at:- " + index);

        }
    }
}
