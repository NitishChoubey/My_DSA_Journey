package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static int lowerBound(int[] arr , int size ,int target) {
        int low = 0;
        int high = size - 1 ;
        int ans = size ;
        while(low <= high){
            int mid = (low + high)/2 ;

            if(arr[mid]>=target){
                ans = mid ;
                high = mid -1 ;
            }
            else {
                low = mid + 1;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ;i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter your target element:- ");
        int target = sc.nextInt() ;

        int index = lowerBound(arr  , size , target);

        System.out.println("Smallest index at which the element is greater than or equal to target element is:- "+ index);

    }
}
