import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of 1st Array:- ");
        int size1 = sc.nextInt() ;

        System.out.print("Enter the size of 2nd Array:- ");
        int size2 = sc.nextInt() ;

        int[] arr1 = new int[size1] ;
        int[] arr2 = new int[size2] ;

        for(int  i = 0 ; i < size1 ; i++){
            arr1[i]  = sc.nextInt() ;
        }

        for(int i  = 0 ; i < size2 ; i++){
            arr2[i] = sc.nextInt() ;
        }


        int[] result = mergedArray(arr1 , arr2)  ;
        for(int i =  0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] mergedArray(int[] arr1 , int[] arr2){

        int i = 0 ;
        int j = 0 ;

        int[] mergedArray = new int[arr1.length + arr2.length] ;

        for(int k  = 0 ; k < mergedArray.length ; k++){
            //System.out.println(k);
            if(i < arr1.length && j < arr2.length){
                //System.out.println(i);
                //System.out.println(j);
                if(arr1[i] < arr2[j]){
                    mergedArray[k] = arr1[i] ;
                    i++ ;
                }else{
                    mergedArray[k] = arr2[j] ;
                    j++ ;
                }
            }else if(i < arr1.length && j >= arr2.length){
                mergedArray[k] = arr1[i] ;
                i++ ;
            }else{
                mergedArray[k] = arr2[j] ;
                j++ ;
            }
        }


        return mergedArray ;


    }
}
