package Hashing;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        //Insertion
        map.put("India" , 120) ;
        map.put("USA"  , 30) ;
        map.put("China" , 150) ;

        System.out.println(map);

        //HashMap are unordered maps
        map.put("China" , 180) ;
        System.out.println(map );

        //Search or lookup operation
        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); //key dosent exist

        //Iteration in HashMap
        // Map.Entry<Integer , Integer>e : Map.entrySet()

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet() ;
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //Remove the pair
        map.remove("China");
        System.out.println(map);

//        int[] arr = {12 , 15 , 20} ;
//        for(int i = 0 ; i < 3 ; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//
//        for(int val : arr){
//            System.out.print(val+ " ");
//        }

    }
}
