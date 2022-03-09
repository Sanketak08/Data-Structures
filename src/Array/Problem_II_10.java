package Array;

public class Problem_II_10 {
    public static void main(String[] args) {
        int arr[] = { 100, 4, 330, 50, 23, 90 };
        maxElement(arr, arr.length);
    }

    // Refer gfg for alernative solution
    static void maxElement(int arr[], int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int maxValue1 = Integer.MIN_VALUE;
        int maxValue2 = Integer.MIN_VALUE;
        int maxValue3 = Integer.MIN_VALUE;

        while (i < n) {
            maxValue1 = Math.max(maxValue1, arr[i]);
            i++;
        }
        
        while (j < n) {
            if (arr[j] != maxValue1) {
                maxValue2 = Math.max(maxValue2, arr[j]);
            }
            j++;
        }
        
        while (k < n) {
            if (arr[k] != maxValue1 && arr[k] != maxValue2) {
                maxValue3 = Math.max(maxValue3, arr[k]);
            }
            k++;
        }

        System.out.println(maxValue1 + " " + maxValue2 + " " + maxValue3);
    }
}
