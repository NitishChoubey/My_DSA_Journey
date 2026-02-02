package BitManipulation;

import java.util.Scanner;

public class NumberOfDigitsInAnRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        System.out.print("Enter the base value:- ");
        int base = sc.nextInt() ;

        int ans = (int) (Math.log(number) / Math.log(base)) + 1 ;
        System.out.println(ans);
    }
}
