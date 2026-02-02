package BinarySearch;
import java.util.* ;

public class BinarySearchIterativeCode {
    public static int binarySearch(int[] arr , int size , int target){
        int low = 0 ;
        int high = size-1 ;

        while(low<=high){
            int mid = (low + high)/2 ;

            if(arr[mid]== target){
                return mid ;
            }
            else if(target > arr[mid]){
                low = mid + 1 ;
            }
            else{
                high = mid -1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an arrayy:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ;i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.print("Enter your target element:- ");
        int target = sc.nextInt() ;

        int index = binarySearch(arr , size , target);

        if(index== -1){
            System.out.println("Target Element is not present");
        }else{
            System.out.println("Target Element is present at:- " + index);

        }
    }
}
