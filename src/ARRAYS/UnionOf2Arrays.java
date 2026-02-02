package ARRAYS;
import java.util.* ;
public class UnionOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;

        int[] arr1 = new int[n1] ;
        int[] arr2 = new int[n2] ;

        for(int i = 0 ; i <n1 ; i++){
            arr1[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt() ;
        }

       Set<Integer> union = new HashSet<>() ;

        for(int i = 0 ; i < n1 ; i++){
            union.add(arr1[i]) ;
        }

        for(int i = 0 ; i < n2 ; i++){
            union.add(arr2[i]) ;
        }

        System.out.println(union);



    }
}
