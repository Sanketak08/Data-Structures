package Array;

public class Problem_II_17 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 5, 7 };
        System.out.println("Result -> " + minimumElement(arr, 0, arr.length));
    }
    
    static int minimumElement(int arr[], int first, int last) {
        int l = first;
        int r = last - 1;

        if (arr[l] <= arr[r]) {
            return arr[l];
        }

        // Refer notes
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int prev = (mid - 1 + last) % last; //Previous of mid
            int next = (mid + last) % last; //Next of mid

            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return arr[mid];
            }

            if (arr[mid] <= arr[last - 1]) {
                r = mid - 1;
            } else if (arr[0] <= arr[mid]) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
