package LEETCODE;

import java.util.Scanner;

public class Question1716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int ans = totalMoney(n) ;
        System.out.println(ans);
    }

    public static int totalMoney(int n) {

        int savings = 0 ;
        int count = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(i > 7 && i % 7 == 1 ){
                count++ ;
            }
            System.out.println(count);

            savings = savings + (i - 6 * count) ;
            System.out.println(savings);

        }


        return savings ;
    }
}
