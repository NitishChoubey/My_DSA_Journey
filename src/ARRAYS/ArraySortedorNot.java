package ARRAYS;
import java.util.* ;
public class ArraySortedorNot {


        public static boolean isSorted(int[] arr , int size){
            int bool = 1 ;
            for(int i = 0 ; i < size -1  ; i++){
                if(arr[i] > arr[i+1]){
                    bool-- ;

                }

            }

            if(bool == 1){
                return true ;
            }
            else{
                return false ;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

        boolean isSorted = isSorted(arr , size) ;
        System.out.println(isSorted);
    }


    }

