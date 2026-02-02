package RECURSION;

public class fibonacciNumber {

    public static void main(String[] args) {

        //
        // System.out.println(fibonaaciNumber1 (6));

        for (int i = 0 ; i < 11 ; i++){
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n){
       return (int) ((( Math.pow(((1 + Math.sqrt(5)) / 2) , n ))  -( Math.pow(((1 - Math.sqrt(5)) / 2) , n ))) / Math.sqrt(5)) ;
    }
    static int fibonaaciNumber1(int n){

        if(n < 2){
            return n ;
        }

        return fibonaaciNumber1(n-1)  + fibonaaciNumber1(n-1) ;
    }
}
