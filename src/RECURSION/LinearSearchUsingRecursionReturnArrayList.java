package RECURSION;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchUsingRecursionReturnArrayList {

    public static ArrayList<Integer> listOfIndex(int[] arr , int target , int index , ArrayList<Integer> list){


        if(index == arr.length){
            return list ;
        }else{
            if(index < arr.length && arr[index] == target){
                list.add(index) ;

            }
            return listOfIndex(arr , target , index+1 , list) ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the length of array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i <  n  ; i++){
            arr[i] = sc.nextInt() ;
        }

        int target = sc.nextInt() ;
        ArrayList<Integer> ans = listOfIndex(arr , target , 0 , new ArrayList<>()) ;
        System.out.println(ans);
    }


}
