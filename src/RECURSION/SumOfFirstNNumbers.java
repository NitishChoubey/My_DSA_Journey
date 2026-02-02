package RECURSION;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt() ;

        int ans = sumOfFirstNNumbers(n);
        System.out.println(ans);



    }

    public static int sumOfFirstNNumbers(int n){
        if(n == 0){
            return 0 ;
        }

        return n + sumOfFirstNNumbers(n - 1) ;
    }
}
