package PrefixSum;

import java.util.Scanner;

public class JustBuildThePrefixArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the array:- ");

        int size = sc.nextInt() ;

        int[] arr = new int[size] ;

        for(int i =  0 ; i < size ; i++){
            arr[i] = sc.nextInt() ;
        }

        //First build the inclusive version or the normal version

        int[] prefixArray = new int[size] ;
        int sum  = 0 ;
        for(int i = 0 ; i < size ; i++){
            sum  = sum + arr[i] ;
            prefixArray[i] = sum ;
        }


        for(int i  = 0  ; i < size ; i++){
            System.out.print(prefixArray[i] + " ");
        }


        System.out.println();

        // Exclusive version --> just exclude the index on which you are standing

        int[] prefixArrayExclude = new int[size + 1] ;
        prefixArrayExclude[0] = 0 ;

        for(int i = 1 ; i < size + 1 ; i++){
            prefixArrayExclude[i] = prefixArrayExclude[i -1] + arr[i -1] ;
        }

        for(int i =  0 ; i  < prefixArrayExclude.length ; i++ ){
            System.out.print(prefixArrayExclude[i] + " ");
        }

    }
}
