package RECURSION;

import java.util.Scanner;

public class CountTheZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int n = sc.nextInt() ;
        int count  = 0 ;
        int ans = countZeroes(n , count) ;
        System.out.println(ans) ;
    }

    public static int countZeroes(int n , int count){

        if(n == 0){
            return count ;
        }

        if(n % 10 == 0){
            return countZeroes(n/10 , count + 1) ;
        }

        return countZeroes(n / 10 ,  count) ;


    }
}
