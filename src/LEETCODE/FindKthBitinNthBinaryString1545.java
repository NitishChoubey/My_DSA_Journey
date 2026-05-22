package LEETCODE;


/*
 * Given two positive integers n and k, the binary string Sn is formed as follows:
 *
 * S1 = "0"
 * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
 * Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).
 *
 * For example, the first four strings in the above sequence are:
 *
 * S1 = "0"
 * S2 = "011"
 * S3 = "0111001"
 * S4 = "011100110110001"
 * Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
 */
public class FindKthBitinNthBinaryString1545 {

    public static void main(String[] args) {

    }

    public static char findKthBit(int n , int k){

        if(n == 1){
            return 0 ;
        }

        return 0;


    }

    public static String invert(String str , int n){

        if(n == str.length()){
            return "" ;
        }
        char ch = str.charAt(n) ;

        if(ch == '0'){
            return '1' + invert(str , n + 1) ;
        }else{
            return '0' + invert(str , n+ 1) ;
        }

    }

    public static String reverse(String str , int n){

        if(n < 0){
            return ""  ;
        }
        char ch = str.charAt(n) ;
        if(ch == '0'){
            return '0' + reverse(str , n - 1) ;
        }else{
            return '1' + reverse(str , n -1) ;
        }
    }
}
