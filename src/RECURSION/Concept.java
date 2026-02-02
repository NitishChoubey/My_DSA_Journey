package RECURSION;

public class Concept {
    public static void main(String[] args) {
        fun(5) ;
    }

    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
       // fun(n--) ; //it will pass 5 only
        fun(--n) ;

        //Concept
        // n-- vs --n --> n-- me phele n pass ho jaaega phir n ki value decrease ki jaegi ...aur --n me phele value decrease ki jaaegi phir value pass hoga
    }
}
