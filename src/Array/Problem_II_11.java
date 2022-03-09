package Array;

public class Problem_II_11 {
    public static void main(String[] args) {
        int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        alteratelyArrange(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    static void alteratelyArrange(int arr[], int n) {
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int positiveInd = j + 1; // Starts from +ve number
        int negativeInd = 0;

        while (positiveInd < n && negativeInd < positiveInd && arr[negativeInd] < 0) {
            int temp = arr[positiveInd];
            arr[positiveInd] = arr[negativeInd];
            arr[negativeInd] = temp;
            positiveInd++;
            negativeInd += 2;
        }
    }
}
