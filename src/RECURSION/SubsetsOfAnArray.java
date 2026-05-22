package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfAnArray {

    public static void main(String[] args) {

        int[] arr = {4 , 4, 4, 1, 4} ;

        List<List<Integer>> ans = subsetsDuplicates(arr) ;

        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] arr){

        List<List<Integer>> outerList = new ArrayList<>() ;

        outerList.add(new ArrayList<>()) ;  //added empty list

        for(int num : arr){
            int n = outerList.size() ;
            for(int i = 0 ; i < n ; i++){
                List<Integer> internalList = new ArrayList<Integer>(outerList.get(i)) ;
                internalList.add(num) ;


                outerList.add(internalList) ;
            }
        }

        return outerList ;
    }


    public static List<List<Integer>> subsetsDuplicates(int[] arr){

        Arrays.sort(arr) ;
        List<List<Integer>> outerList = new ArrayList<>() ;

        outerList.add(new ArrayList<>()) ;  //added empty list

        int start = 0 ;
        int end = 0 ;
        for(int i = 0 ; i < arr.length ; i++){

            start = 0 ;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1 ;
            }
            end = outerList.size() -1 ;
            int n = outerList.size() ;
            for(int j = start ; j < n ; j++){
                List<Integer> internalList = new ArrayList<Integer>(outerList.get(j)) ;
                internalList.add(arr[i]) ;


                outerList.add(internalList) ;
            }
        }

        return outerList ;
    }
}
