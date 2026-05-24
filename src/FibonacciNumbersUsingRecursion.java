import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbersUsingRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter how many fibonacci number you want:- ");
        int n = sc.nextInt() ;

        List<Integer> list = new ArrayList<>() ;

        for(int i = 0 ; i < n ; i++){
            list.add(fiboNumbers(i)) ;
        }

        System.out.println("First " + n + " fibonaaci numbers are:- " + list);

    }

    public static int fiboNumbers(int n){

        if(n < 2){
            return n ;
        }

        return fiboNumbers(n - 1) + fiboNumbers(n - 2) ;




    }
}
