package ARRAYS;
import java.util.*;
public class FindItinerary {
    public static String getStart(HashMap<String, String> tick){
        //this function will return the starting point of the journey
        HashMap<String , String> revMap = new HashMap<>() ;

        for(String key : tick.keySet()){
            //key -> key ; val -> tick.get(key)
            revMap.put(tick.get(key) , key) ;
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key ;
            }
        }
        return null ;

    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>() ;
        tickets.put("Chennai" , "Bengaluru") ;
        tickets.put("Mumbai" ,"Delhi") ;
        tickets.put("Goa" ,"Chennai" ) ;
        tickets.put("Delhi", "Goa") ;

        String start = getStart(tickets) ;

        while(tickets.containsKey(start)){
            System.out.print(start+ "->");
            start = tickets.get(start) ;
        }
        System.out.println(start);
    }
}
