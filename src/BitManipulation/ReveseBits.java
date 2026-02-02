package BitManipulation;

public class ReveseBits {
    public static void main(String[] args) {
        int n = 43261596 ;

        StringBuilder result = new StringBuilder() ;


        while(n > 0 ){

            int newnum = n % 2 ;
            result.append(newnum) ;
            n = n / 2 ;

        }

        StringBuilder newresult = result.reverse() ;

        System.out.println(newresult);


    }


}
