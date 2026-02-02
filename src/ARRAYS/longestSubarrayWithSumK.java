package ARRAYS;
import java.util.* ;
public class longestSubarrayWithSumK {

        public static int longestSubarray(int[] arr, int k) {
            // code here
            //Brute force Approach
            int len = 0 ;

            for(int i = 0 ; i < arr.length ; i++){
                for(int j = i ; j < arr.length ;j++){
                    int sum = 0;
                    for(int l = i ; l <=j ; k++) {
                        sum = sum + arr[l];
                    }
                        if(sum == k){
                            len = Math.max(len , j-i+1) ;
                        }

                }
            }
            return len ;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        int maxLen = longestSubarray(arr , k) ;
        System.out.println(maxLen);
    }
    }

