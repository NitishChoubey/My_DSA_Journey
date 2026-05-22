package SlidingWindow;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the size of the array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter the value of k:- ");
        int k = sc.nextInt() ;


        int l = 0 ;
        int r = k - 1 ;

        int sum = 0 ;
        for(int i = l ; i <= r ; i++){
            sum = sum + arr[i] ;
        }

        int maxSum = sum ;

        while(r < arr.length -1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];

            if (sum > maxSum){
                maxSum = sum ;
            }

        }

        System.out.println(maxSum);

    }
}
