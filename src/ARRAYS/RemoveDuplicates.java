package ARRAYS;
import java.util.*;
public class RemoveDuplicates {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

//        Set<Integer> set = new HashSet<>() ;
//        for(int i = 0 ; i  < size; i++){
//            set.add(arr[i]);
//        }
//
//        System.out.println(set);
//
//        int index = 0 ;
//        for(Integer it : set){
//            arr[index] =  it;
//            index++ ;
//        }
//        System.out.println(index );
//        System.out.println(Arrays.toString(arr));

        //optimal solution
        int p1 = 0 ;
        int j = p1 + 1 ;

        for(int i = 1 ; i < size ; i++){
            if(arr[p1] == arr[j]){
                j++ ;
            }
            else if(arr[p1] != arr[j]){
                arr[p1+1] = arr[j] ;
                p1++ ;
                j++ ;


            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(p1 + 1);


    }
}
