package ARRAYS;
import java.util.* ;
public class MoveAllZerosToAnEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt() ;

        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt() ;
        }
        //this solution fails if there is consecutive zeros
//        for(int i = 0  ; i < n ; i++){
//            if(arr[i] == 0 ){
//                for(int j = i ; j < n -1 ; j++){
//                    int temp = arr[j] ;
//                    arr[j] = arr[j+1] ;
//                    arr[j+1] = temp ;
//                }
//            }
//        }
        //brute force approach --> by me
//        ArrayList<Integer> temp  = new ArrayList<>();
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i] != 0){
//                temp.add(arr[i]) ;
//            }
//        }
//
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i] == 0 ){
//                temp.add(arr[i]) ;
//            }
//        }
//
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(temp.get(i)+ " ");
//        }


        //Brute force approach --> Striver
        //time complexity --> O(2n)
        //Space complexity --> O(n)
//        ArrayList<Integer>  temp = new ArrayList<>();
//
//        for(int i = 0 ; i < n ;i++ ){
//            if(arr[i] != 0){
//                temp.add(arr[i]) ;
//            }
//        }
//
//        for(int i = 0 ; i < temp.size() ; i++) {
//            arr[i] = temp.get(i) ;
//        }
//
//        for(int i = temp.size() ; i < n ; i++){
//            arr[i] = 0 ;
//        }
//
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i]+ " ");
//        }


        //Optimal Solution


        int j= -1 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] ==0 ){
                j = i ;
                break ;
            }
        }
        if(j == -1){
            System.out.println(arr[0]);  // use return statement make a separare function for this
        }

        for(int i = j+1 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                j++;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }



    }
}
