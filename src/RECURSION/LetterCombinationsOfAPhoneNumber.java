package RECURSION;

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {

        String[] mapLetters = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"} ;
        String digits = "23" ;

        String[] s = new String[digits.length()] ;

        for(int i = 0 ; i < digits.length() ; i++){
            char ch = digits.charAt(i) ;
            int index = ch - '0' ;
            s[i] = mapLetters[index] ;
        }

        //ArrayList<String> list  = letterCombinations(s) ;

        //System.out.println(list);
    }

//    public static ArrayList<String> letterCombinations(String[] letters){
//
//
//
//    }
}
