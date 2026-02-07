package LEETCODE;

import java.util.Scanner;

public class MinimumRemovalsToBalanceTheArray3534 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter the value of k:- ");
        int k = sc.nextInt() ;

        int ans = minRemoval(arr , k) ;
        System.out.println(ans);
     }

    public static int minRemoval(int[] nums, int k) {

        if(nums.length == 1){
            return 0 ;
        }
        int count = 0 ;

        for(int  i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j <nums.length ; j++ ){
                if(nums[i] >= nums[j]){
                    if(nums[i] <= k * nums[j]){
                        count++ ;
                    }else{
                        continue ;
                    }
                }else if(nums[i] < nums[j]){
                    if(nums[j] <= k * nums[i]){
                        count++ ;
                    }else{
                        continue ;
                    }
                }
            }
        }
        System.out.println(count);

        if(count == 0){
            return 1 ;

        }

        System.out.println(count);

        return Math.abs(nums.length - 2 * count) ;

    }




}
