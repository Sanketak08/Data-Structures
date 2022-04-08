package String;

public class Problem_II_23 {
    public static void main(String[] args) {
        System.out.println(minimumRotations("aaaaa"));
    }
    
    public static int minimumRotations(String s) {
        int len = s.length();
        String temp = s + s; // Temporary concatenated string to avoid rotations

        for (int i = 1; i <= len; i++) {
            String subString = temp.substring(i, i + len);

            if (s.equals(subString)) {
                return i;
            }
        }
        return len;
    }
}
