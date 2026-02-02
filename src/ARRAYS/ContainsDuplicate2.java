package ARRAYS;
import java.util.Scanner ;
import static java.lang.Math.abs;

public class ContainsDuplicate2 {
    public  static boolean  containsNearbyDuplicate(int[] nums, int k){

        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i + 1 ; j < nums.length ; j++ ){
                if((nums[i] == nums[j]) && ((abs(i -j)) <=k) ){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt() ;
        }

        boolean containsDuplicate = containsNearbyDuplicate(nums , k ) ;

        System.out.println(containsDuplicate);
     }
}
