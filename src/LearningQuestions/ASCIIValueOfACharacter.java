package LearningQuestions;

public class ASCIIValueOfACharacter {
    public static void main(String[] args) {

        char ch = 'a' ;
        System.out.println(ch + 0 ); // output --> 97 (ascii value of 'a')
        System.out.println((char) (ch + 0)); // output --> a
    }
}
