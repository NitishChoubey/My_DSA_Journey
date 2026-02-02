package BinarySearch;
import java.util.* ;
public class FirstandLastOcurenceOfElementInAnArray {

    public static int firstOccurence(int[] nums , int n , int target){
        int low = 0 ;
        int high = n -1 ;
        int first = -1 ;

        while(low <= high){
            int mid= (low + high) / 2 ;
            if(nums[mid] == target){
                first = mid ;
                high = mid -1 ;
            }
            else if(nums[mid] < target){
                low = mid + 1 ;
            }else{
                high = mid - 1 ;
            }
        }
        return first ;
    }

    public static int lastOccurence(int[] nums , int n , int target){
        int low = 0 ;
        int high = n -1 ;
        int last = -1 ;
        while(low <= high){
            int mid = (low + high)/2 ;
            if(nums[mid] == target){
                last = mid ;
                low = mid + 1 ;
            }
            else if(nums[mid] > target){
                high = mid -1 ;
            }
            else{
                low = mid + 1 ;
            }
        }
        return last ;
    }
//    public static int lowerBound(int[] nums, int n, int target) {
//        int low = 0;
//        int high = n - 1;
//        int ans = n;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (nums[mid] >= target) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    public static int upperBound(int[] nums, int n, int target) {
//        int low = 0;
//        int high = n - 1;
//        int ans = n;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (nums[mid] > target) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }
//
  public static int[] FirstandLastPosition(int[] nums, int n, int target) {

        int first = firstOccurence(nums , n , target);
        if(first == -1){
            int[] result = new int[2] ;
            result[0] = -1 ;
            result[1] = -1 ;
            return result ;
        }

        int last = lastOccurence(nums , n , target) ;
        int[] result1 = new int[2] ;
        result1[0] = first ;
        result1[1] = last ;
        return result1 ;


        // lower bound and upper bound approach
//        int lb = lowerBound(nums, n, target);
//
//        if (lb == n || nums[lb] != target) {
//            int[] result = new int[2];
//            result[0] = -1;
//            result[1] = -1;
//
//            return result;
//        }
//        int ub = upperBound(nums , n , target) ;
//
//        int[] result1 = new int[2] ;
//        result1[0] = lb ;
//        result1[1] = ub -1 ;
//
//        return result1 ;
//
//
  }


    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt() ;
        int[] nums = new int[n] ;

        for(int i = 0 ; i< n ; i++){
            nums[i] = sc.nextInt() ;
        }
        System.out.print("Enter the target number:- ");
        int target = sc.nextInt() ;

       int[] answer = FirstandLastPosition(nums , n ,target) ;
       for(int i = 0 ; i < answer.length ; i++){
           System.out.print(answer[i] + " ");
       }
    }

}
