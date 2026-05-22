public class PrintingCombinationsOfLetters {

    public static void main(String[] args) {

        printPermutations("" , "AAB") ;
    }

    public static void printPermutations(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0) ;

        printPermutations(p + ch , up.substring(1)) ;

        printPermutations(p , up.substring(1));

    }
}
