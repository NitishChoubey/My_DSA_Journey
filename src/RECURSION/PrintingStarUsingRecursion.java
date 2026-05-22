package RECURSION;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintingStarUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of rows:- ");
        int row = sc.nextInt() ;

        //printStar(row) ;

        printStarR(row , 0) ;


    }


    //Not using pure recursion concept
//    public static void printStar(int row){
//
//
//        int col = 0 ;
//        if(row > 0) {
//            while (row > col) {
//                System.out.print("*" + " ");
//                col++;
//            }
//
//            System.out.println();
//            printStar(--row) ;
//        }
//
//
//
//    }

    public static void printStarR(int row , int col){
        if(row == 0){
            return ;
        }

        if(row > col){
            System.out.print("*" + " ");
            printStarR(row , col+1) ;
        }else{
            System.out.println();
            printStarR(row - 1 , 0) ;
        }
    }
}
