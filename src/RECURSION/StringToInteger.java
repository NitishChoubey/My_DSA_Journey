package RECURSION;

public class StringToInteger {

    public static void main(String[] args) {

        int ans = myAtoi("  -042b56") ;
        System.out.println(ans) ;
    }

    public static int myAtoi(String s ){


        int n = 0 ;
        int sign  = 1 ;

        while(n < s.length() && s.charAt(n) == ' '){
            n++ ;
        }

        if(n == s.length()){
            return 0 ;
        }

        if(n < s.length() && (s.charAt(n) == '+' || s.charAt(n) == '-')){
            if(s.charAt(n) == '+'){
                sign = 1 ;
            }else if(s.charAt(n) == '-'){
                sign = -1 ;
            }

            n++ ;
        }

        return StringToIntegerConvert(s , n , 0 , sign) ;


    }

    public static int StringToIntegerConvert(String s , int n , int ans , int sign){

        if(n == s.length() || !Character.isDigit(s.charAt(n))){
            return ans * sign  ;
        }

        int digit = s.charAt(n) - '0' ;

        if(ans>(Integer.MAX_VALUE - digit)/10){
            return (sign ==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }

        ans = ans * 10 + digit ;

        return StringToIntegerConvert(s , n +1 , ans , sign) ;
    }
}
