package ARRAYS;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        //brute force approach
//        Arrays.sort(arr) ;
//        int largest = arr[n-1];
//        int secondLargest = 0 ;
//        for(int i = n- 2 ; i >=0 ; i--){
//            if(arr[i] != largest){
//                secondLargest = arr[i] ;
//                break ;
//            }
//
//        }
//
//        System.out.println(secondLargest);


        //better approach
//        int largest = arr[0] ;
//        for(int i = 1 ; i < n ; i++){
//            if(arr[i] >= largest){
//                largest = arr[i] ;
//            }
//        }
//
//        int secondLargest = Integer.MIN_VALUE ;
//        for(int i = 0 ; i < n ; i++) {
//            if((arr[i] > secondLargest) && (arr[i] != largest)){
//                secondLargest = arr[i] ;
//            }
//        }
//
//        System.out.println("The second largest is:- " + secondLargest);

            //optimal solution

            int largest = arr[0] ;
            int secondLargest = Integer.MIN_VALUE ;

            for(int i = 1 ; i < n ; i++){
                if(arr[i] > largest ) {
                    secondLargest = largest ;
                    largest = arr[i] ;
                }
                 else   if (arr[i] < largest && arr[i] > secondLargest ) {
                        secondLargest = arr[i];
                    }
                }

        System.out.println("Largest is: " + largest);
        System.out.println("Second Largest is: " + secondLargest);
    }
}
