package ARRAYS;
import java.util.* ;
public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;

        int[]  nums1 = new int[n1] ;
        int[] nums2 = new int[n2] ;

        for(int i = 0 ; i < n1 ; i++){
            nums1[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i < n2 ; i++){
            nums2[i] = sc.nextInt() ;
        }

        HashSet<Integer> set = new HashSet<>() ;

        for(int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]) ;  //first array ke element ko set me add kr diaa....
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums2.length ; i++){
            if(set.contains(nums2[i])){  // ab array2 ke element ko compare kr rha h set se ....agr set ke andrr hoga to list ke andrr add kr do...aur phir usko remove kr do taaki wo aage match naa ho kyoki ek hi baar match krna h aur add krna h
                list.add(nums2[i]) ;
                set.remove(nums2[i]) ;
            }
        }

        int[] intersectionArray = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            intersectionArray[i] = list.get(i) ;
        }

        for(int i = 0 ; i < intersectionArray.length ; i++){
            System.out.print(intersectionArray[i] + " ");
        }

    }
}
