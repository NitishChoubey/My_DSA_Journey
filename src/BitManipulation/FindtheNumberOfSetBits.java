package BitManipulation;

import java.util.Scanner;

public class FindtheNumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        int ans = noOfSetBits(number) ;
        System.out.println(ans);


    }

    public static int noOfSetBits(int number){
        String s = Integer.toBinaryString(number) ;

        int counter = 0  ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                counter++ ;
            }
        }

        return counter ;
    }
}
