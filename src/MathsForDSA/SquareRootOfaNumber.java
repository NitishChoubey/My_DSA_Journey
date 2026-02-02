package MathsForDSA;

import java.util.Scanner;

public class SquareRootOfaNumber {
    // I am going to find the square root of the number using brute force approach which is coming in my mind , and if the number is not the perfect square then i will  print "Nmumber is not a perfect square"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        squareRoot(number) ;


    }

    public static void squareRoot(int number){
        for(int i = 0 ; i * i <= number ; i++ ){
            if(i * i == number){
                System.out.println(i);
            }
        }
    }
}
