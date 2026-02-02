import java.util.Scanner;

public class decimatobinaryconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number:- ");
        int number = sc.nextInt() ;

        String binaryString = Integer.toBinaryString(number) ;
        System.out.println(binaryString);

        int twocompliment = ~number + 1 ;

        System.out.println(Integer.toBinaryString(twocompliment));

        StringBuilder sb = new StringBuilder() ;
        StringBuilder newnum =  sb.append(Integer.toBinaryString(twocompliment)).reverse() ;
        System.out.println(newnum);
        String newnum1= newnum.toString() ;


        int ans = Integer.parseInt(newnum1 , 2) ;
        System.out.println(ans);






    }
}
