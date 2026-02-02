package LEETCODE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximizeSumOfSquareOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        int num  = sc.nextInt() ;
//        int sum = sc.nextInt() ;
//
//        String ans = maxSumOfSquares(num , sum) ;

        System.out.println(maxSumOfSquares(10 , 23));

    }


    public static String maxSumOfSquares(int num, int sum) {
        int start = (int) Math.pow(10 , num - 1) ;
        int end = (int) (Math.pow(10 , num) - 1 );

        int number = 0 ;
        int sumOfDigits = 0 ;
        int temp = 0 ;

        List<Integer> list = new ArrayList<>() ;
        for(int i = start ; i<=end ; i++){
            temp = i ;

            while(temp!= 0){

                number = temp % 10 ;

                sumOfDigits = sumOfDigits + number ;
                temp = temp /10 ;
            }


            if(sumOfDigits == sum){

                list.add(i) ;
            }
            sumOfDigits = 0 ;
        }

        int maxOfSquares = 0 ;
        int temp1 = 0 ;
        int max = Integer.MIN_VALUE ;
        int ans1 = 0  ;
        for(int i = 0 ; i < list.size() ; i++){
            int num1 = list.get(i) ;
            while(num1 != 0 ){
                temp1 = num1 % 10 ;
                maxOfSquares = maxOfSquares + temp1 * temp1 ;
                num1 = num1 / 10 ;
            }

            if(maxOfSquares >= max){
                max = maxOfSquares ;
                ans1 =  list.get(i);
            }

            maxOfSquares = 0 ;

        }

        if(ans1 != 0 ){
            return String.valueOf(ans1) ;
        }else{
            return "" ;
        }
    }
}
