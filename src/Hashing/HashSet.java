package Hashing;
import java.util.Iterator ;
public class HashSet {
    public static void main(String[] args) {
        //Creating
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        //ArrayList<Integer> list = new ArrayList<>();

        //Insert
        set.add(1) ;
        set.add(2);
        set.add(3) ;
        set.add(1) ;

        //Size
        System.out.println("Size of set is:- " + set.size());

        //Printing the elements of the set
        System.out.println(set);

        //Search --> contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not conatains 6");
        }

        //Delete
//        set.remove(1) ;
//        if(!set.contains(1)){
//            System.out.println("does not contain 1 , as we deleted it");
//        }

        //Iterator
        //Sets ka koi index nhi hota hai
//        for(int i = 0  ; i < n ; i++){
//            //here 'i' is the iterator
//        }
        Iterator it = set.iterator() ;

        //hasNext ; next

         while(it.hasNext()){
             System.out.println(it.next());
         }

    }
}
