package ARRAYS;
import java.util.* ;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0 ;
        while(n>=0){
            int rem = n % 10 ;
            sum = sum + (rem * rem) ;
            n = n / 10 ;
            list.add(sum) ;
        }

        if(list.contains(1)){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not happy Number");
        }
    }
}
