package BitManipulation;

import java.util.Scanner;

public class ResetTheIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in binary form: - ");  //binary me hi kr rha hun abhi
        String binaryString = sc.nextLine();
        System.out.print("Enter the bit position you want to set 1: - ");
        int n = sc.nextInt();

        int number = Integer.parseInt(binaryString, 2);

        String ans = ResetTheBit(number, n);
        System.out.println(ans);
    }

    public static String ResetTheBit(int number , int n){
        int mask = 1 << (n - 1) ;

        int correctMask = ~(mask) ;


        int setTheBit = (number & correctMask) ;

        String s1 = Integer.toBinaryString(setTheBit) ;

        return s1 ;
    }
}
