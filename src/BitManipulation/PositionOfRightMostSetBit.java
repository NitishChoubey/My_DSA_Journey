package BitManipulation;

import java.util.Scanner;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number in binary form: - ");
        String binaryString = sc.nextLine() ;

        int number = Integer.parseInt(binaryString ,2) ;

        int ans = positionSetBit(number) ;
        System.out.println(ans);

    }

    public static int positionSetBit(int number){
        int negativeOfNumber = ~(number) + 1 ;

        int newBinaryNumber = number & negativeOfNumber ;

        String s = Integer.toBinaryString(newBinaryNumber) ;

        int counter = 0 ;
        int position = 0 ;
        for(int i = s.length() - 1 ; i >= 0; i--){
            counter++ ;
            if(s.charAt(i) == '1'){
                position = counter ;
            }
        }

        return position ;
    }
}
