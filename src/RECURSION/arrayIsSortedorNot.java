package RECURSION;

import java.util.Scanner;

public class arrayIsSortedorNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        boolean ans = isSorted(arr , 0) ;
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr , int index){
        int n = arr.length ;

        if(index == n-1){
            return true ;
        }

        return arr[index] < arr[index + 1] && isSorted(arr , index+1) ;

    }
}
