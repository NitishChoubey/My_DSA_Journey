package ARRAYS;
import java.util.* ;
public class LeetCode3194 {

    public static void main(String[] args) {
        int[] arr = {3 , 4 , 5  , 7  , 9 , 1} ;
        Arrays.sort(arr) ;

//        ArrayList<Integer> myArr = new ArrayList<>() ;
//       for(int i = 0 ; i< arr.length ; i++){
//           myArr.add(arr[i]) ;
//
//        }

//       for(int i =0 ; i < arr.length ; i++){
//           System.out.println(myArr.get(i));
//       }
       double[] avg = new double[3] ;

       for(int i = 0 ; i < (arr.length/2) ; i++){
           avg[i] = ((double) arr[i] + arr[((arr.length - 1) - i)] )/ 2 ;

       }

       for(int i = 0 ; i < (arr.length / 2) ; i++){
           System.out.println(avg[i]);
       }

        Arrays.sort(avg) ;
        System.out.println(avg[0]);
    }
}
