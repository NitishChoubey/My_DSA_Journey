package BitManipulation;

import java.util.Scanner;

public class SumOfTheNthRowOfThePascalTriangle {
    public static void main(String[] args) {
        //We have to find the sum of the nth row of the pascal triangle
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // and so on in the same manner

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of row: - ");
        int number = sc.nextInt() ;

        //int sum = (int) Math.pow(2 , number - 1);
        //we can also do that
        int sum = 1 << (number-1) ;
        System.out.println(sum);





    }
}
