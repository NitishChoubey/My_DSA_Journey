package String;

import java.util.Stack;

public class Leetcode3 {
    public static void main(String[] args) {

        int ans = lengthOfLongestSubstring("pwwkew") ;
        System.out.println(ans);
    }


    public static int lengthOfLongestSubstring(String s) {

        Stack<Character> st = new Stack<>() ;
        int max = 0  ;
        for(int i = 0 ; i < s.length() ; i++){
            int count = 1 ;
            st.push(s.charAt(i)) ;
            for(int j = i + 1 ; j < s.length() ; j++){
                if(s.charAt(i) == s.charAt(j) || st.contains(s.charAt(j))){

                    break;
                }else{
                    count++ ;
                    st.push(s.charAt(j)) ;

                }





            }
            st.clear() ;
            System.out.println("count is: " + count);
            if(count > max){
                max = count ;
            }
        }

        return max ;

    }
}
