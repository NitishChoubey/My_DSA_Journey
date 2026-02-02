import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt() ;


        for(int  i = 0 ; i < T ; i++){
            int N = sc.nextInt() ;

            int[] arr = new int[N] ;

            for(int j = 0 ; j < N ; j++){
                arr[j] = sc.nextInt() ;
            }




            for(int k = 0 ; k < N-1 ; k++){
                for(int l = k ; l > 0 ; l--){
                    if(arr[k] == arr[0]){
                        System.out.print(1) ;
                    }
                    else if(arr[k] > arr[l-1] ){
                        System.out.print(1) ;
                    }
                    else{
                        System.out.print(0) ;
                    }
                }
                System.out.println() ;
            }
        }
    }
}
