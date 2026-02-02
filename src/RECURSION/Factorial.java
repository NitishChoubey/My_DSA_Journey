package RECURSION;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number n:- ");
        int num = sc.nextInt() ;

        int ans = factorialOfANumber(num) ;
        System.out.println(ans);



    }

    public static int factorialOfANumber(int num){

        if(num == 0){
            return 1 ;
        }

        return num * factorialOfANumber(num - 1) ;
    }
}
