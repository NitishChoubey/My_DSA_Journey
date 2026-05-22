package RECURSION;

public class PowerXToThePowerN {
    public static void main(String[] args) {

        double ans = calculatePower(2 , -20 , 1 , 1) ;
        System.out.println(ans);
    }

    public static double calculatePower(double x , double n , double count, double ans){

        if(n > 0 ) {
            if (count > n) {
                return ans;
            }


            ans = ans * x;

            return calculatePower(x, n, count + 1, ans);
        }else{
            if(count > - (n)){
                return ans ;
            }

            ans =  ans * (1/x) ;

            return calculatePower(x , n , count+1 , ans) ;
        }
    }
}
