package LearningQuestions;

import java.util.Scanner;

public class RemoveAParticularAlphapbetFromAString {

    //You will be given a string and u have to remove all 'a' from that string

    //for example : String s = "bacaad"
    //String ans  = "bccd"

    //Using iteration approach
//    public static void main(String[] args) {
//        Scanner sc  =  new Scanner(System.in) ;
//        System.out.print("Enter the length of the string:- ");
//        int len = sc.nextInt() ;
//        sc.nextLine() ;
//        System.out.print("Enter the string:- ");
//        String s = sc.nextLine() ;
//
//        StringBuilder sb = new StringBuilder()  ;
//
//        for(int i =  0 ; i < len ; i++){
//            if(s.charAt(i) != 'a'){
//                sb.append(s.charAt(i)) ;
//            }
//        }
//
//        System.out.println(sb);
//
//
//    }

    // using recursion approcah
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in) ;
        System.out.print("Enter the length of the string:- ");
        int len = sc.nextInt() ;
        sc.nextLine() ;
        System.out.print("Enter the string:- ");
        String s = sc.nextLine() ;

        String ans = removeCharacter(s , 0 ) ;

        System.out.println(ans);

    }

    public static String removeCharacter(String s , int i){





        if(i == s.length()){

            return "" ;
        }

        char ch = s.charAt(i) ;
        if(ch == 'a'){
            return removeCharacter(s, i+1) ;

        }else{
            return ch + removeCharacter(s , i + 1) ;
        }





    }

    //One more approach
    public static void skipChar(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0) ;
        if(ch == 'a'){
             skipChar(p , up.substring(1)) ;
        }else{
            skipChar(p + ch , up.substring(1)) ;
        }

    }






}
