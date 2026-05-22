package RECURSION;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllTheSubsetOfAStringUsingIteration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }

        List<List<Integer>> ans = subset(arr) ;
        System.out.println(ans);

    }


    static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>() ;

        outer.add(new ArrayList<>()) ; // adding empty list inside the outer list

        for(int num : arr){
            int n = outer.size() ;
            for(int i = 0 ; i < n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)) ;
                internal.add(num) ;
                outer.add(internal) ;
            }
        }

        return outer ;
    }
}
