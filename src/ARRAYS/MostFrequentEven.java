package ARRAYS;
import java.util.* ;
public class MostFrequentEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() ;
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1) ;
            } else{
                map.put(nums[i] , 1) ;
            }
        }
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0 && map.get(nums[i]) > max){
                System.out.println("isme aaya mai phele");
                max = map.get(nums[i]);
                System.out.println(max);

            }else{
                System.out.println("idhr ich aaya");
                System.out.println(-1);
            }
        }
        System.out.println(max);
    }
}
