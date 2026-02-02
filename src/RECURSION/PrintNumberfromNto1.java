package RECURSION;

import java.util.Scanner;

public class PrintNumberfromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of n:- ");
        int num = sc.nextInt() ;

        print(num) ;

    }

    public static void print(int num){

        if(num < 1){
            return ;
        }else{
            System.out.println(num);
            print(num - 1) ;
        }



    }
}

