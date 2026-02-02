package SORTING;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
        public static void merge(int[] arr , int low , int mid , int high){
                ArrayList<Integer>  myArr = new ArrayList<>() ;

                int left = low ;
                int right = mid+1 ;

                while(left<= mid && right <= high ){
                        if(arr[left] <= arr[right]){
                                myArr.add(arr[left]);
                                left++ ;
                        }
                        else{
                                myArr.add(arr[right]);
                                right++ ;
                        }
                }
                while(left<= mid){
                        myArr.add(arr[left]);
                        left++ ;
                }
                while(right <= high){
                        myArr.add(arr[right]);
                        right++ ;
                }

                for(int i = low ; i<= high ; i++){
                        arr[i] = myArr.get(i - low ) ;
                }
        }

        public static void mergeSort(int[] arr , int low , int high){
                if(low >= high){
                        return ;
                }
                int mid = (low + high)/2 ;
                mergeSort(arr ,  low , mid);
                mergeSort(arr , mid+1 , high);
                merge(arr , low , mid , high) ;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in) ;
                System.out.print("Enter the size of an array:- ");
                int n = sc.nextInt() ;

                int[] arr = new int[n] ;
                for(int i = 0 ; i < n ; i++){
                        arr[i] = sc.nextInt() ;
                }

                mergeSort(arr , 0 , n -1);

                System.out.print("Array after Sorting:- ");
                for(int i = 0 ; i< n; i++){
                        System.out.print(  arr[i] + " ");
                }

        }

}
