package Array;

import java.util.ArrayList;

class rangeRow {
    int start;
    int end;

    rangeRow(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class Problem_II_19 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 60, 90, 50 };
        ArrayList<rangeRow> list = new ArrayList<>();
        list.add(new rangeRow(1, 3));
        list.add(new rangeRow(2, 4));
        list.add(new rangeRow(0, 2));
        gcdOfRange(arr, list);
    }

    static int gcd(int a, int b) {
        int small = Math.min(a, b);
        int large = Math.max(a, b);

        if (large % small == 0) {
            return small;
        } else {
            int rem = large % small;
            return gcd(rem, small);
        }
    }
    
    static void gcdOfRange(int[] arr, ArrayList<rangeRow> list) {
        for (rangeRow ele : list) {
            int prevGcd = arr[ele.start];
            for (int i = ele.start; i <= ele.end; i++) {
                prevGcd = gcd(prevGcd, arr[i]);
            }
            System.out.print(prevGcd + " ");
        }
    }
}
