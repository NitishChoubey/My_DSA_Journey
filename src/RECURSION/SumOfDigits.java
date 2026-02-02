package RECURSION;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // let's suppose number = 12378   , ans = 1+2+3+7+8 =21
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int num = sc.nextInt() ;

        int ans = sum(num) ;
        System.out.println(ans);



    }

    public static int sum(int num){

        if(num == 0){
            return 0 ;
        }

        return (num % 10) + sum(num / 10) ;



    }
}
