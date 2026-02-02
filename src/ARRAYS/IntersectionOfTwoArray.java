package ARRAYS;
import java.util.*;
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;

        int[] nums1 = new int[n1] ;
        int[] nums2 = new int[n2] ;
        for(int i = 0 ; i < n1 ; i++){
            nums1[i] = sc.nextInt() ;
        }

        for(int i = 0 ; i < n2 ; i++){
            nums2[i] = sc.nextInt() ;
        }

        //Brute force appraoch --> T.C --> O(n1 * n2) ;

//        int[] visited = new int[n2] ;
//        for(int i = 0 ; i < n2 ; i++){
//            visited[i]  = 0 ;
//        }
//
//        ArrayList<Integer> intersection = new ArrayList<>() ;
//
//        for(int i = 0 ; i < n1 ; i++){
//            for(int j = 0 ; j < n2 ; j++){
//                if(nums1[i] == nums2[j] && visited[j] == 0){
//                    intersection.add(nums1[i]) ;
//                    visited[j] = 1 ;
//                    break;
//                }
//                if(nums2[j] > nums1[i]){
//                    break ;
//                }
//            }
//
//        }
//
//        for(int i = 0 ; i < intersection.size() ; i++){
//            System.out.print(intersection.get(i) + " ");
//        }

        //Optimal Approach
        int i = 0 ;
        int j = 0 ;

        ArrayList<Integer> intersection = new ArrayList<>() ;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++ ;
            }
            else if(nums2[j] < nums1[i]){
                j++ ;
            }
            else{
                intersection.add(nums1[i]) ;
                i++;
                j++ ;
            }
        }

        for (int k = 0; k < intersection.size(); k++) {
            System.out.print(intersection.get(k)+ " ");

        }


    }
}
