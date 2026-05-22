package LearningQuestions;

public class reversingTheNumber{
    public static void main(String[] args) {
        int num = 14 ;
        int a = num ;
        int reverseNum = 0 ;
        while(a > 0){
            int digit = a % 10 ;
            reverseNum = reverseNum * 10 + digit ;
            a = a / 10 ;
        }

        System.out.println(num);
        System.out.println(reverseNum);
    }
}
