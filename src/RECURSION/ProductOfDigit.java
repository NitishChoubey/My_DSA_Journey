package RECURSION;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int num = sc.nextInt() ;

        int ans = productDigit(num) ;
        System.out.println(ans);


    }

    public static int productDigit(int num){
        if(num == 0 ){
            return 0 ;
        }
        if(num == 1){
            return 1;
        }

        return (num % 10) * productDigit(num / 10) ;

    }
}
