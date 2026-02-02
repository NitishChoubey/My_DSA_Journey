package Codeforces;
import java.util.*;
public class DIERoll {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt() ;
        int W = sc.nextInt() ;

        if(Y==1 && W==1){
            System.out.println("1/1");
        }

        else if((Y >= W && Y == 2) || (W>=Y && W==2)){
            System.out.println("5/6");
        }
        else if((Y >= W && Y == 3) || (W>=Y && W==3)){
            System.out.println("2/3");
        }
        else if((Y >= W && Y == 4) || (W>=Y && W==4)){
            System.out.println("1/2");
        }
        else if((Y >= W && Y == 5) || (W>=Y && W==5)){
            System.out.println("1/3");

        }
        else if((Y >= W && Y == 6) || (W>=Y && W==6)){
            System.out.println("1/6");
        }
    }
}
