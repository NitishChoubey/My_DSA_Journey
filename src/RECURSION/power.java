package RECURSION;

public class power {
    public static void main(String[] args) {
        double value = myPow(2 , 3) ;
        System.out.println(value);
    }

    static double myPow(double x , int n) {

        if(n == 0) {
            return 1 ;
        }


        int count = 0;
        double number = 1;

        if(n < 0){
            while(count < -(n)) {
                number = (1 / x) * number ;
                count++ ;
            }
            return number ;
        }

        while (count < n) {
            number = x * number;
            count++ ;
        }
        return number ;
    }
}
