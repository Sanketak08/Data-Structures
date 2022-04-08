package String;

import java.util.ArrayList;

public class Problem_II_22 {
    public static void main(String[] args) {
        System.out.println("Hello");
        // Refer gfg test cases
    }
    
    public static boolean wordBreak(String A, ArrayList<String> B) {
        int size = A.length();

        if (size == 0) {
            return true;
        }

        for (int i = 1; i <= size; i++) {
            if (B.contains(A.substring(0, i)) && wordBreak(A.substring(i, size), B)) {
                return true;
            }
        }
        return false;
    }
}
