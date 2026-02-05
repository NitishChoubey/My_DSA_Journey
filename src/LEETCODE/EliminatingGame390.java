package LEETCODE;

import java.util.ArrayList;

public class EliminatingGame390 {

    public static ArrayList<Integer> removeElement(ArrayList<Integer> arr){


        if(arr.size() == 1){
            return arr ;
        }

        if(arr.size() > 1){

            for(int i = 0 ; i < arr.size() ; i++){
                arr.remove(i) ;
            }




            if(arr.size() > 1) {
                for (int j = arr.size() - 1; j >= 0; j = j - 2) {
                    arr.remove(j);
                }
            }
        }

        return removeElement(arr) ;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        int size = 9 ;
        for(int i = 1; i <= size ; i++ ){
            list.add(i) ;
        }

        ArrayList<Integer> ans = removeElement(list) ;
        System.out.println(ans.get(0));


    }
}
