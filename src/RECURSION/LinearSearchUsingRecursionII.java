package RECURSION;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchUsingRecursionII {

    public static ArrayList<Integer> listOfIndex(int[] arr , int index , int target){
        ArrayList<Integer> list = new ArrayList<>() ;

        if(index == arr.length){
            return list ;
        }

        if(arr[index] == target){
            list.add(index) ;
        }

        ArrayList<Integer> ansFromBelowCalls = listOfIndex(arr , index+1 , target);
        list.addAll(ansFromBelowCalls) ;

        return list ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the length of array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i <  n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target number:- ");
        int target = sc.nextInt() ;


        System.out.println(listOfIndex(arr , 0 , target));



    }
}
