package RECURSION;

public class NumberExampleRecursion {

    public static void main(String[] args) {
        print(1) ;
    }


    static void print(int n){

        if(n  > 5){ //base condition
            return ;
        }
        System.out.println(n);

        //this is called tail recursion
        //this is the last function call

        print(n + 1) ;
    }
}
