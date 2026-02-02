package ARRAYS;

import java.util.Scanner;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr){

        for(int i = 0 ; i < arr.length ; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;

            }
        }

            if(arr.length == 1 ){
                return false ;
            }

            for(int i = 0 ; i  <= arr.length - 2 ; i++){
                if(arr[i] == arr[i+1]){
                    //System.out.println("Hello");
                    return true ;
                }
            }
            return false ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        boolean result = containsDuplicate(arr) ;
        System.out.println(result);

        System.out.print("Array after Sorting:- ");
        for(int i = 0 ; i< n; i++){
            System.out.print(  arr[i] + " ");
        }

    }
}
