package RECURSION;

import java.util.Scanner;

public class SumOfDigitsAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value n:- ");
        int n = sc.nextInt() ;

        int ans = sumOfDigits(n) ;
        System.out.println(ans);
    }

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0 ;
        }

        return (n % 10) + sumOfDigits(n / 10) ;
    }
}
