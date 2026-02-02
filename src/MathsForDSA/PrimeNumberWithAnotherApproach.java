package MathsForDSA;

import java.util.Scanner;

public class PrimeNumberWithAnotherApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        boolean ans = isPrime(number) ;
        System.out.println(ans);
    }

    public static boolean isPrime(int number){
        if (number <= 1){
            return false ;
        }

        int i = 2 ;
        while(i * i <= number){
            if(number % i == 0){
                return false ;
            }
            i++ ;
        }

        return true ;
    }
}
