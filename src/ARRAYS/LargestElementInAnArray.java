package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;



public class LargestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;

        //taking input
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt() ;
        }

        //code for largest element
//        for(int i = size-1 ; i>=1 ; i--){
//            for(int j = 0  ; j <= i-1 ; j++ ){  //for(int j = i-1 ; j < size-1; j++) this can alo be written
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j] ;
//                    arr[j] = arr[j+1] ;
//                    arr[j+1] = temp ;
//                }
//            }
//        }

        //Sorting will be the brute force approach for this question
//        Arrays.sort(arr);
//        System.out.print("The largest element is:- " + arr[size-1]);


        //Optimal Solution
        int largest = arr[0] ;
        for(int i = 1 ; i < size ; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is:- "+ largest);
        }
    }

