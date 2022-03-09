package Array;

public class Problem_II_14 {
    public static void main(String[] args) {
        factorial(10);
    }
    
    static void factorial(int n) {
        int arr[] = new int[5000];
        arr[0] = 1;
        int list_size = 1;

        for (int i = 2; i <= n; i++) {
            list_size = multiply(arr, list_size, i);
        }

        for (int i = list_size - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    static int multiply(int arr[], int size, int x) {
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int prod = arr[i] * x + carry;
            arr[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            arr[size] = carry % 10;
            carry = carry / 10;
            size++;
        }

        return size;
    }
}
