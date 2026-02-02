package BinarySearch;
import java.util.* ;
public class CeiltheFloor {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);

        int low1 = 0;
        int high1 = arr.length - 1;
        int low2 =  0 ;
        int high2 = arr.length-1 ;
        int ans1 = -1;
        int ans2 = -1;
        while (low1 <= high1) {
            int mid1 = (low1 + high1) / 2;
            if (arr[mid1] <= x) {
                ans1 = arr[mid1];
                low1 = mid1 + 1;
            } else {
                high1 = mid1 - 1;
            }
        }

        while (low2 <= high2) {
            int mid2 = (low2 + high2) / 2;
            if (arr[mid2] >= x) {
                ans2 = arr[mid2];
                high2 = mid2 - 1;
            } else {
                low2 = mid2 + 1;
            }


        }
        int[] result = new int[2];
        result[0] = ans1;

        result[1] = ans2;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of an array:- ");
        int size = sc.nextInt() ;

        int[] arr = new int[size] ;
        for(int i = 0 ; i < size ;i++){
            arr[i] = sc.nextInt() ;
        }
        int target = sc.nextInt() ;

        int[] result = getFloorAndCeil(target , arr) ;

        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
