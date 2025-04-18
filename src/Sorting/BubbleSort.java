package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {64,34,25,12};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0;i<n;i++) {
            for (int j = 0; j < n -i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
