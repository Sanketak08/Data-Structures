package String;

public class Problem_II_1 {
    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "or";
        System.out.println("Result -> " + checkRotation(s1, s2));
    }

    static int isSubstring(String s1, String s2) {
        int counter = 0;
        int i = 0;
        for (; i < s1.length(); i++) {
            if (counter == s2.length()) {
                break;
            }
            if (s2.charAt(counter) == s1.charAt(i)) {
                counter++;
            } else {
                // If preceding character is duplicate
                if (counter > 0) {
                    i -= counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length() ? -1 : i - counter;
    }

    static int checkRotation(String s1, String s2) {
        String temp = s1 + s1;

        int result = isSubstring(temp, s2);
        return result;
    }
}
