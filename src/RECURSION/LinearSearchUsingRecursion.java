package RECURSION;

import java.util.Scanner;

public class LinearSearchUsingRecursion {


    public static boolean isPresent(int[] nums , int target, int index){
        if(index == nums.length){
            return false ;
        }else {
            if (index < nums.length && nums[index] == target) {
                return true;
            }else{
                return isPresent(nums , target , index+1) ;
            }
        }





    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the length of the array:- ");
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt() ;
        }

        System.out.print("Enter the target number:- ");
        int target =  sc.nextInt() ;

        boolean ans = isPresent(nums, target , 0 ) ;
        System.out.println(ans);
    }
}
