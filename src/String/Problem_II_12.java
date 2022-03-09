package String;

public class Problem_II_12 {
    public static void main(String[] args) {
        String x = "ABCDGH";
        String y = "AEDFHR";
        System.out.println(subsequenceRecursive(x, y, x.length(), y.length()));
    }
    
    static int subsequenceRecursive(String x, String y, int n, int m) {
        // Base condition
        if (n == 0 || m == 0) {
            return 0;
        }

        // Code according to Choice diagram
        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return 1 + subsequenceRecursive(x, y, n - 1, m - 1);
        } else {
            return Math.max(subsequenceRecursive(x, y, n, m - 1), subsequenceRecursive(x, y, n - 1, m));
        }
    }
}
