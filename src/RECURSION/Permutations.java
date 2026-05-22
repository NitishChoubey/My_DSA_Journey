package RECURSION;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {

        //printPermutations("" , "abc")  ;
        ArrayList<String> list = permutations("" , "AAB") ;
        System.out.println(list);
    }

    public static ArrayList<String> permutations(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list ;
        }
        char ch = up.charAt(0) ;
        ArrayList<String> list = new ArrayList<>() ;
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0 , i) ;
            String last = p.substring(i , p.length()) ;


            list.addAll(permutations(first+ch+last , up.substring(1)) );
        }

        return list ;


    }

    public static void printPermutations(String p , String up){
        //p --> processed , up --> unprocessed


        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0) ;
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0 , i) ;
            String last = p.substring(i , p.length()) ;


            printPermutations(first+ch+last , up.substring(1)) ;
        }
    }
}
