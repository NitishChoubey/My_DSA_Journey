import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonaaciNumber {
    public static void main(String[] args) {


        //We have to print the fibonaaci numbers :- 0 , 1, 1 , 2 , 3 , 5 , 8 , 13

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index or which position fibonacci number u want:- ");
        int n = sc.nextInt() ;

        //first 2 fibo number
        int a = 0 ;
        int b = 1 ;

        List<Integer> list = new ArrayList<>() ;
        list.add(0) ;
        list.add(1) ;


        int count = 0 ;
        int sum = 0 ;
        if(n == 1){
            System.out.println(0);
        }else if(n == 2){
            System.out.println(1);
        }else{
            while(count < n - 2){

                sum = a + b ;

                a = b ;
                b = sum ;
                count++ ;
                list.add(sum) ;
            }

            System.out.println(sum);
        }

        System.out.println("First " + n + " fibonaaci numbers are:- " + list);


    }
}
