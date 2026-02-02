package ARRAYS;

import java.util.Scanner;

public class ThirdMaximumNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE + 3 ;
        int thirdLargest = Integer.MIN_VALUE + 1 ;

        for(int i =1 ; i<n ; i++){
            if(arr[i] > largest){
                System.out.println(4);
               thirdLargest = secondLargest ;
                secondLargest = largest ;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                System.out.println(3);
                    secondLargest = arr[i] ;
                    thirdLargest = secondLargest ;
            }
            else if(arr[i] < largest && arr[i] <secondLargest && arr[i] > thirdLargest){
                System.out.println(2);
                thirdLargest = arr[i] ;
            }
            else if(arr[i] < largest && arr[i] <secondLargest && arr[i] < thirdLargest){
                System.out.println(1);
                thirdLargest = arr[i] ;
            }


        }

        if(thirdLargest == (Integer.MIN_VALUE)+3){
            System.out.println(5);
            thirdLargest = largest ;
        }
        if(thirdLargest == (Integer.MIN_VALUE)+1){
            System.out.println(6);
            thirdLargest = largest ;
        }

        System.out.println("Largest is: " + largest);
        System.out.println("Second Largest is: " + secondLargest);
        System.out.println("Third Largest is: " + thirdLargest);

    }
}
