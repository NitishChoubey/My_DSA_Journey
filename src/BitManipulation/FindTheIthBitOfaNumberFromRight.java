package BitManipulation;

import java.util.Scanner;

public class FindTheIthBitOfaNumberFromRight {
    //We have given a number and we have to find the ith bit of it

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number in binary form: - ");
        String binaryString = sc.nextLine() ;
        System.out.print("Enter the bit position: - ");
        int n = sc.nextInt() ;

        int number = Integer.parseInt(binaryString , 2) ;  //converting that binary String into decimal

        String ans = ithBit(number , n) ;
        System.out.println(ans);
    }

    public static String ithBit(int number,  int n){
        System.out.println(number);
        int mask = 1<<(n - 1) ;

        int ithbit = (number & mask) ;
        System.out.println(ithbit);

        String s1 = Integer.toBinaryString(ithbit) ;
        System.out.println(s1);

        int counter = 0 ;
        String bit = "0" ;
        for(int i =  s1.length() - 1; i >=0  ; i--){
            counter++ ;
            if(counter == n){
                bit = String.valueOf(s1.charAt(i));

            }
        }

        return bit ;
    }
}


//Important Points
// The String.valueOf() method in Java is a static utility method that converts various data types into their string representation.
// It's a convenient and safe way to get the string form of a value.

// For example -->  It returns the string representation of the primitive value. For example, String.valueOf(100) returns the string "100" .