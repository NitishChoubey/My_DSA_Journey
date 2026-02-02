package MathsForDSA;

import java.util.Scanner;

public class SquareRootOfANumberUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();

        System.out.print("Enter the precision value p:- ");
        int p = sc.nextInt() ;

        System.out.println(squareRoot(num , p));

    }
        // O(log(N))
    public static double squareRoot(int num , int p) {
        int start = 0;
        int end = num;


        double root = 0.0;
        while (start <= end) {
            int mid = start + (end -start) / 2 ;
            if (mid * mid == num) {
                return mid;
            }

            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.1 ;
        for(int i = 0  ; i  < p ; i++){
            while(root * root <= num){
                root += incr ;
            }

            root -= incr ;
            incr /= 10 ;
        }

        return root ;
    }
}
