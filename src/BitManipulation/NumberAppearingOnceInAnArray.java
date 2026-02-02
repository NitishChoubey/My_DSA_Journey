package BitManipulation;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NumberAppearingOnceInAnArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array: - ");
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;

        System.out.println("Enter the elements of the array");
        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ; i++ ){

             arr[i] = sc.nextInt() ;

        }

//        int num = UniqueNumber(arr , size) ;
//        System.out.println(num);

        int num = UniqueNumberByXOR(arr , size);
        System.out.println(num);



    }

    //My approach - brute force approach

    /**
    public static int UniqueNumber(int[] arr , int size){


        int unique = 0 ;
        for(int i = 0 ; i < size  ; i++){
            int occurence = 0 ;
            for(int j = 0  ; j < size ; j++){
                if(arr[i] == arr[j]){
                    occurence++ ;
                }

            }

            if(occurence == 1){
                unique = arr[i] ;
            }
        }

        return unique ;

    }
     **/

    public static int UniqueNumberByXOR(int[] arr , int size){

        int unique = 0  ;
        for(int i = 0 ; i < size ; i++){
             unique = arr[i] ^ unique ;
        }

        return unique ;
    }


}
