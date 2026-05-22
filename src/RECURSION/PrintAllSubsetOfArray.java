package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsetOfArray {

    public static void main(String[] args) {

        int[] arr = {1 ,2 ,3} ;
        List<Integer> list1 = new ArrayList<>() ;
        List<Integer> list2 = new ArrayList<>() ;
        for(int i = 0 ; i < arr.length ; i++){
            list2.add(arr[i]) ;
        }
        List<List<Integer>> ans = new ArrayList<>() ;
        printSubsets(list1 , list2 , ans) ;

        System.out.println(ans);
    }

    public static void printSubsets(List<Integer> list1  , List<Integer> list2 , List<List<Integer>> ans ){

        if(list2.isEmpty()){

            ans.add(new ArrayList<>(list1)) ;
            return;
        }

        int num = list2.get(0) ;
        list2.remove(0) ;
        list1.add(num) ;

         printSubsets(list1 , list2 , ans) ;
         list1.remove(list1.size() -1) ;
         printSubsets(list1 , list2 , ans) ;
         list2.add(0 ,num) ;
    }
}
