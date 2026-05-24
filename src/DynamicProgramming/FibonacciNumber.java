package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many fibonacci number you want:- ");
        int n = sc.nextInt() ;

        List<Integer> list = new ArrayList<>() ;
        int[] dp = new int[n+1] ;

        for(int i = 0 ; i < dp.length ; i++){
            dp[i] = -1 ;
        }

        for(int i = 0 ; i < n ; i++){
            list.add(fiboNumber(i , dp)) ;
        }

        System.out.println("First " + n + " fibonaaci numbers are:- " + list);


    }

    public static int fiboNumber(int n , int[] dp){

        if(n <= 1){
            return n ;
        }

        if(dp[n] != -1){
            return dp[n] ;
        }



        return dp[n] = fiboNumber(n - 1 , dp) + fiboNumber(n - 2 , dp) ;

        //return dp[n] = fiboNumber(n - 1 , dp) + fiboNumber(n - 2 , dp) ; is line ko aise bhi simply likh skte hai

//        int ans = fiboNumber(n - 1 , dp) + fiboNumber(n - 2 , dp) ;
//
//        dp[n] = ans ;
//
//        return ans ;
    }
}
