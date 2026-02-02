package MathsForDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// the time complexity of this program is --> n * sqrt(n)
public class FindOutAllThePrimeNumbersLessThanAGivenNumber {
    // We have given a number N , now find out all the number < N which are prime .
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: - ");
        int number  = sc.nextInt() ;

        for(int i = 2 ; i < number ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }





    }

    public static boolean isPrime(int number){

        if(number <= 1){
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
