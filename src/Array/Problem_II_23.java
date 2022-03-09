package Array;

public class Problem_II_23 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2 };
        int[] result = twoRepeated(arr, 2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static int[] twoRepeated(int arr[], int N) {
        int sum = 0;
        int product = 1;
        int x, y, diff;
        int n = N;

        for (int i = 0; i < N + 2; i++) {
            sum = sum + arr[i];
            product = product * arr[i];
        }

        sum = sum - (n * (n + 1)) / 2;
        product = product / factorial(n);

        diff = (int) Math.sqrt(sum * sum - 4 * product);

        x = (sum + diff) / 2;
        y = (sum - diff) / 2;

        return new int[] { y, x };
    }
}