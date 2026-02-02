package ARRAYS;
import java.util.* ;
public class RotatearrayByKPlaces {

   public static void Reverse(int arr[], int start, int end)
    {
        while (start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        //MyFirstApproach
//        for(int i = 0 ; i < k ; i++ ){
//            for(int j = 0 ; j < n -1 ; j++){
//                int temp = arr[j] ;
//                arr[j] = arr[j + 1] ;
//                arr[j + 1] = temp ;
//            }
//        }
//
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }

        // Second Approach --> Striver
//        for(int i = 0 ; (i < k % n) ; i++ ){
//            for(int j = 0 ; j < n-1 ; j++){
//                int temp = arr[j] ;
//                arr[j] = arr[j + 1] ;
//                arr[j + 1] = temp ;
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }

        //Striver Another approach
//        k = k % n ;
//        int[] temp = new int[k] ;
//        for(int i = 0 ; i < k ; i++){
//            temp[i] = arr[i] ;
//        }
//
//        for(int i = k ; i < n ; i++){
//            arr[i - k ] = arr[i] ;
//        }
//
//        for(int  i = n-k ; i < n ; i++){
//            arr[i] = temp[i - (n-k)] ;
//        }
//
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }
  //  }

        //somelike reversal algorithm

//        ArrayList<Integer> temp  = new ArrayList<>() ;
//        for(int i = 0 ; i < k ; i++){
//            temp.add(arr[(k-1)-i]) ;
//        }
//
//        for(int i = 0 ; i <=k ; i++){
//            temp.add(arr[n-1-i]) ;
//        }
//
//        for(int i = 0 ; i< n ; i++){
//            arr[i] = temp.get(n-1-i) ;
//        }
//        for (int i =0 ; i <n ; i++){
//            System.out.print(temp.get(i) + " ");
//        }
//        System.out.println();
//
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }

        //Using Reversal algorithm--for right rotate

        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);

        //for left rotate

//        // Reverse first k elements
//        Reverse(arr, 0, k - 1);
//        // Reverse last n-k elements
//        Reverse(arr, k, n - 1);
//        // Reverse whole array
//        Reverse(arr, 0, n - 1);

        for(int i = 0 ; i < n ; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
