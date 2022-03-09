package Array;

public class Problem_I_vi {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 9, 6, 33, 19 };
        int k = 3;
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Kth maximum element : " + arr[arr.length - k]);
        System.out.println("Kth minimum element : " + arr[k - 1]);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
