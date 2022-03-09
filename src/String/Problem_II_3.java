package String;

public class Problem_II_3 {
    public static void main(String[] args) {
        String a = "ABZ";
        String b = "CD";
        String c = "ACDBZ";
        System.out.println(isInterLeaved(a, b, c));
    }
    
    static boolean isInterLeaved(String a, String b, String c) {
        int i = 0, j = 0, k = 0;

        while (k != c.length()) {
            if (i < a.length() && a.charAt(i) == c.charAt(k)) {
                i++;
            } else if (j < b.length() && b.charAt(j) == c.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        // If A+B > C then return false
        if (i < a.length() || j < b.length()) {
            return false;
        }
        return true;
    }
}
