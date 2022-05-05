package Array;

public class Problem_II_13 {
    public static void main(String[] args) {

    }
    
    public static long largestSum(int[] arr, int n) {
        long sum = 0;
        long maxValue = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxValue = Math.max(sum, maxValue);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxValue;
    }
}
