package RECURSION;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number n:- ");
        int n = sc.nextInt() ;


        if(n == reverseDigits(n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    public static int reverseDigits(int n){
        if(n == 0){
            return 0 ;
        }

        return (n % 10) * (int) Math.pow(10 , (int) Math.log10(n)) + reverseDigits(n / 10) ;
    }
}
