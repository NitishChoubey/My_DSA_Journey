package MathsForDSA;

import java.util.Scanner;


// time complexity of this algorithm is --> O(N * log(log(N)))
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        boolean[] primes = new boolean[number + 1] ;
        sieve(number , primes) ;

    }

    // false in array means number is prime

    public static void sieve(int number , boolean[] primes){

        for(int i = 2 ; i * i <= number ; i++){
            if(!primes[i]){
                for(int j = i * 2 ; j <= number ; j = j + i ){
                    primes[j] = true ;
                }
            }
        }

        for(int i = 2 ; i <= number ; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }

    }
}
