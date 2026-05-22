package LearningQuestions;

public class Leetcode {

    public static void main(String[] args) {
        System.out.println(sumOfPrimesInRange(14));
    }

        public static int sumOfPrimesInRange(int n) {

            int num = n ;
            int reverseNum = 0 ;
            System.out.println(num);
            while(num > 0){
                int digit = num % 10 ;
                reverseNum = reverseNum * 10 + digit ;
                num = num / 10 ;
            }

            System.out.println(reverseNum);
            System.out.println(n);

            int sum = 0 ;
            int min = Math.min(n , reverseNum) ;
            int max = Math.max(n , reverseNum) ;

            System.out.println("min:- " + min);
            System.out.println("max:- " + max);
            for(int i = min; i <= max ; i++){
                if(isPrime(i)){
                    System.out.println(i);
                    sum = sum + i ;
                }
            }

            return sum ;


        }

        public static boolean isPrime(int num){

            if(num <= 1){
                return false ;
            }

            if(num == 2 || num == 3){
                return true ;
            }

            if(num % 2 == 0){
                return false ;
            }

            for(int i = 3 ; i <= Math.sqrt(num) ; i += 2){
                if(num % i == 0){
                    return false ;
                }
            }

            return true ;
        }
    }

