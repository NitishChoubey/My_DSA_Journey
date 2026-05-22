import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {



        Set<String> list1 = generateSubsets("" , "AAABBC") ;



        System.out.println(list1.size() );

    }

    public static Set<String> generateSubsets(String p , String up ){

        if(up.isEmpty()){
            Set<String> set = generatePermutations("" , p) ;

            return set ;

        }

        char ch = up.charAt(0) ;

        Set<String> left = generateSubsets(p + ch , up.substring(1)) ;
        Set<String> right  = generateSubsets(p  , up.substring(1) ) ;


        right.addAll(left) ;

        return right ;

    }

    public static Set<String> generatePermutations(String p , String up){

        if(up.isEmpty()){
            Set<String> set = new HashSet<>() ;
            if(!p.isEmpty()){
                set.add(p) ;
            }
            return set ;
        }

        char ch = up.charAt(0) ;
        Set<String> set = new HashSet<>() ;
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0 , i) ;
            String second = p.substring(i , p.length()) ;

            set.addAll(generatePermutations(first + ch + second , up.substring(1))) ;
        }

        return set ;
    }
}