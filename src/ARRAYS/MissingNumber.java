package ARRAYS;
import java.util.* ;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() ;

        }
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ;  i <nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put( nums[i], map.get(i)+ 1);
            }else{
                map.put(nums[i] , 1) ;
            }
        }
        int k = 0 ;
        int ans = 0 ;
        while(k <= nums.length){
            if(map.containsKey(k)){
                k++;
            }else{
                ans = k ;
            }
        }
        System.out.println(ans);
    }
}
