package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        String s = "babad" ;

        String ans = "" ;

        int maxLen = 0 ;

        for(int i = 0 ; i < s.length(); i++ ){
                String s1 = "" ;
            for(int j = i + 1 ; j <= s.length() ; j++){

                s1 = s.substring(i , j) ;

                //System.out.println(s1);
                boolean isPalindrome = isPalindrome(s1) ;

                if(isPalindrome){
                    maxLen = Math.max(maxLen , s1.length()) ;

                    if(maxLen == s1.length()){
                        ans = s1 ;
                    }
                }








            }


        }

        System.out.println(ans);

    }

    public static boolean isPalindrome(String s){

        //System.out.println("Initial string is:- " + s);
        String reverseString = "";

        for(int i = s.length() - 1 ; i >=0 ; i--){
            char ch = s.charAt(i) ;
            reverseString = reverseString + ch ;
        }

        //System.out.println("reverse string is:- " + reverseString);
        if(reverseString.equals(s)){
            return true ;
        }


        return false ;








    }
}

