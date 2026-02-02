package ARRAYS;
import java.util.* ;
public class FindDuplicateNumber {
    public static void main(String[] args) {
        //There is one more approach using hasharray jisse maine leetcode pe solve kraa h
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt() ;
        }
        //Using HashSet
//        HashSet<Integer> set = new HashSet<>() ;
//        for(int i = 0 ; i < nums.length ; i++){
//            if(!set.add(nums[i])){
//                System.out.println(nums[i]);
//                break ;
//            }
//        }

        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1) ;
            }else{
                map.put(nums[i] ,1) ;
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > 1) {
                System.out.println(key);
            }
        }


    }
}
