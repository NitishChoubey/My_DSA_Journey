package ARRAYS;
import java.util.*;

import static java.lang.reflect.Array.set;

public class UnionOfTwoSortedArrrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        //Brute Force Approach
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0 ; i<n1 ; i++){
//            set.add(nums1[i]);
//        }
//        for(int i = 0 ; i<n2 ; i++){
//            set.add(nums2[i]);
//        }
//
//       Object[] union = set.toArray() ;
//
//        for(int  i = 0 ; i < set.size() ; i++){
//            System.out.print(union[i] + " ");
//        }

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);

                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            }

        }
        while (i < n1) {
            if (union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);

            }
            i++ ;
        }

        while (j < n2) {
            if (union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);

            }
            j++ ;
        }


        for (int k = 0; k < union.size(); k++) {
            System.out.print(union.get(k) + " ");
        }
    }
}

