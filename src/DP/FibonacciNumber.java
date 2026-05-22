package DP;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int n = sc.nextInt() ;

        //int ans = fiboUsingRecursion(n) ;
        int ans = fiboUsingDP(n) ;

        System.out.println(ans);

    }

    //Using dynamic Programming
    public static int fiboUsingDP(int n){

        int[] dp = new int[n + 1] ;

        Arrays.fill(dp , -1) ;

        if(n <= 1){
            return n ;
        }

        //Memoization
        if(dp[n] != -1){
            return dp[n] ;
        }

        return dp[n] = fiboUsingDP(n-1) + fiboUsingDP(n - 2) ;

    }


    public static int fiboUsingRecursion(int n){

        //indexing of number starting from 0 , like 0th  number is  0 , 1st fibo number is :- 1 ...
        if(n <= 1){
            return n ;
        }


        return fiboUsingRecursion(n-1) +fiboUsingRecursion(n-2) ;
    }
}
