package RECURSION;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortUsingRecursion{
    public static void main(String[] args) {

        // isme original array modify nhi ho rha hai
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;

        for(int i  = 0 ; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

        int[] ans = mergeSort(arr) ;

        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }

    }

    public static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr ;
        }

        int mid = arr.length / 2 ;

        int[] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr , mid  , arr.length)) ;

        return merge(left , right)  ;
    }

    public static int[] merge(int[] first , int[] second){

        int  i = 0 ;
        int j = 0 ;

        int[] mergedArray = new int[first.length + second.length] ;

        for(int k = 0 ;  k < mergedArray.length ; k++ ){
            if(i < first.length && j < second.length){
                if(first[i] < second[j]){
                    mergedArray[k] = first[i] ;
                    i++ ;
                }else{
                    mergedArray[k] = second[j] ;
                    j++ ;
                }
            }else if(i < first.length) {

                mergedArray[k] = first[i] ;
                i++ ;
            }else{
                mergedArray[k] = second[j] ;
                j++ ;
            }
        }

        return mergedArray ;
    }
}
