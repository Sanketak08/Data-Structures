package Array;

public class Problem_II_6 {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
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
            while (arr[start] < arr[pivot]) {
                start++;
            }

            while (arr[end] > arr[pivot]) {
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
