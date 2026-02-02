package BitManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        String s = Integer.toBinaryString(number) ;
        int length = s.length() ;


        boolean ans = isPowerOfTwo(number , length) ;
        System.out.println(ans);


    }


    public static boolean isPowerOfTwo(int number , int length){
        int mask = 1 << (length - 1) ;

        int value = number & mask ;

        if(value != number || number <=0){
            return false ;
        }

        return true ;
    }
}


//Best approach for this just do --> n & (n-1) == 0 if it is true then yes it is power of two and if it is false then it is not.....