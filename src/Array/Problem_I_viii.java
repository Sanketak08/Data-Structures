package Array;

public class Problem_I_viii {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 1, 0, 0, 2, 2, 1, 1, 0 };
        sortArr(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortArr(int arr[], int n) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            switch (arr[j]) {
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
                    break;
                case 2:
                    countTwo++;
                    break;
                default:
                    break;
            }
        }

        while (countZero > 0) {
            arr[i] = 0;
            i++;
            countZero--;
        }
        while (countOne > 0) {
            arr[i] = 1;
            i++;
            countOne--;
        }
        while (countTwo > 0) {
            arr[i] = 2;
            i++;
            countTwo--;
        }
    }
}
