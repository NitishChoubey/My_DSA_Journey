package Codeforces;
import java.util.* ;
public class flag {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;

        int[][] arr = new int[n][m];

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < m  ; j++){
                arr[i][j] = sc.nextInt() ;

            }
        }
        int f = 1 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m-1 ; j++){
                if(arr[i][j] == arr[i][j+1] ){
                    f = f ;
                }
                else{
                    f = f - 1 ;
                }
            }
        }
        for(int i = 0 ; i < n -1 ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] != arr[i+1][j]){
                    f = f  ;
                }
                else{
                    f = f - 1;
                }
            }
        }
        System.out.println(f);
        if( f == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
