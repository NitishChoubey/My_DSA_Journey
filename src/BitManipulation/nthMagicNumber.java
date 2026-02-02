package BitManipulation;

import java.util.Scanner;

public class nthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n:- ");
        int n = sc.nextInt() ;

        String s = Integer.toBinaryString(n) ;

        int ans = nthNumber(s) ;
        System.out.println(ans);

    }

    public static int nthNumber(String s){

        int sum = 0 ;

        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) == '1'){
                sum = (int) (sum + Math.pow(5 , s.length() - i));
            }else{
                sum = sum + 0 ;
            }
        }

        return sum ;
    }
}
