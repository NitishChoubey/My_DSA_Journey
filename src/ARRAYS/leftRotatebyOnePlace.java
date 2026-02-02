package ARRAYS;
import java.util.* ;

public class leftRotatebyOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }
        //My approach
//        for(int i = 0 ; i < n - 1 ; i++){
//            int temp = arr[i] ;
//            arr[i] = arr[i+1] ;
//            arr[i+1] = temp ;
//        }
//
//        for(int i = 0  ; i < n ; i++){
//            System.out.print(arr[i]+ " ");
//        }


        //Strivers Approach
        int temp = arr[0] ;
        for(int i = 1 ; i < n; i++){
            arr[i-1] =arr[i] ;
        }

         arr[n-1] = temp ;
        for(int i = 0  ; i < n ; i++){
           System.out.print(arr[i]+ " ");
       }

    }
}
