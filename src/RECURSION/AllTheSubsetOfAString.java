package RECURSION;

import java.util.ArrayList;
import java.util.Scanner;

public class AllTheSubsetOfAString {

    //"abc" --> subsets are "a" , "b" , "c" , "ab" , "ac" , "bc" , "abc"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the String:- ");
        String s = sc.nextLine() ;


        subsetString("" , s) ;

        ArrayList<String> ans = subsetStringRet("" , s) ;
        System.out.println(ans);
    }



    //using recursion
    public static void subsetString(String p , String up){
        // p--> processed , up--> unprocessed

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0) ;

        subsetString(p + ch , up.substring(1)) ;  //take it
        subsetString(p , up.substring(1)) ; //ignore it
    }

    public static ArrayList<String> subsetStringRet(String p ,  String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list ;
        }

        char ch = up.charAt(0) ;
        ArrayList<String> left = subsetStringRet(p + ch , up.substring(1)) ;  //saare left call ke answers ko
        ArrayList<String> right = subsetStringRet(p , up.substring(1)) ; //saare right call ke answers ko

        left.addAll(right) ;
        return left ;
    }
}
