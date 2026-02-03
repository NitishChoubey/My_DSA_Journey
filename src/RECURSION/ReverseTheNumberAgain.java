package RECURSION;

import java.util.Scanner;

public class ReverseTheNumberAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number n:- ");
        int n = sc.nextInt() ;

        int ans  = reverseTheNumber(n) ;
        System.out.println(ans);
    }

    public static int reverseTheNumber(int n){

        if(n == 0){
            return 0;
        }

        return (n % 10) * (int)Math.pow(10 , (int) (Math.log10(n) )) + reverseTheNumber(n / 10) ;
    }
}
