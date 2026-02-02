package SORTING;

import java.util.Scanner;

public class QuickSort {

    public static int findPI(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;
        return j;

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pI = findPI(arr, low, high);
            quickSort(arr, low, pI - 1);
            quickSort(arr, pI + 1, high);


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.print("Array after Sorting:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
