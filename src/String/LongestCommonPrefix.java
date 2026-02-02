package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower" , "flow" , "flight"} ;

        StringBuilder commonPrefix = new StringBuilder("") ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() < min){
                min = strs[i].length() ;
            }
        }

        for(int i = 0 ; i < min ; i++){
            char currentChar = strs[0].charAt(i) ;

            for(int j = 1 ; j < strs.length ; j++){
                if(currentChar != strs[j].charAt(i)){
                    System.out.println(commonPrefix);
                    return  ;
                }
            }
            commonPrefix.append(currentChar) ;
        }

        System.out.println(commonPrefix);


    }

}
