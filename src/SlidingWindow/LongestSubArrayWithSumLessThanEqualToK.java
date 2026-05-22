package SlidingWindow;

import java.util.Scanner;

public class LongestSubArrayWithSumLessThanEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0  ; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter the value of k:- ");
        int k = sc.nextInt() ;


        int l = 0 ;
        int r = 0 ;
        int sum = 0 ;
        int maxLength = 0 ;

        while(r < arr.length){
            sum = sum + arr[r] ;

            while(sum > k){
                sum = sum - arr[l] ;
                l = l + 1 ;
            }

            maxLength = Math.max(maxLength , r - l + 1) ;

            r++ ;




        }

        System.out.println(maxLength);
    }
}
