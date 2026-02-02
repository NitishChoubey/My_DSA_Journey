package BitManipulation;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        /**Scanner sc = new Scanner(System.in) ;

        int num = sc.nextInt() ;

        String ans = OddOrEven(num) ;
        System.out.println(ans);



    }

    public static String OddOrEven(int num){
        int lastBit = num  % 2 ;

        if(lastBit == 0) {
            return "Even";
        }
         return "Odd" ;

    } **/

        //Kunal Approach

        //Important point --> Every number is calculated in binary form internally.
        //computer phele number ko binary form me convert krega and then action perform krega


        int n = 67 ;
        System.out.println(OddOrEven(n));





}
    public static String OddOrEven(int n){
        if((n & 1) == 1) {
            return "Odd" ;
        }
        return "Even" ;
    }
         }

