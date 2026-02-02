package BinarySearch;
import java.util.* ;
public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt() ;
        int[] nums = new int[n] ;

        for(int i = 0 ; i< n ; i++){
            nums[i] = sc.nextInt() ;
        }

        int low = 0 ;
        int high = nums.length - 1 ;
        int ans = -1 ;
        while(low <= high){
            int mid = low + ((high-low) /  2) ;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                System.out.println("hello");
                ans = mid ;
            }
            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]){
                System.out.println("hello1");
                low = mid + 1 ;
            }
            else {
                System.out.println("hello2");
                high = mid -1 ;
            }
        }
        System.out.println(ans);
    }
}
