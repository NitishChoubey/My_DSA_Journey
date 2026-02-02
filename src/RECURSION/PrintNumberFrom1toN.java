package RECURSION;

import java.util.Scanner;

public class PrintNumberFrom1toN {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        System.out.print("Enter the number n:- ");
        int num = sc.nextInt() ;

        printNumbers(num) ;

        //printNum(1 , num) ;
    }

    //Basic Approach
    public static void printNumbers(int num){
        if(num == 0){
            return ;
        }

        printNumbers(num -1 );
        System.out.println(num);
    }



    //Another Approach
    public static void printNum(int start , int num){

        if(start > num){
            return ;
        }

        System.out.println(start);
        printNum(start + 1 , num) ;
    }
}
