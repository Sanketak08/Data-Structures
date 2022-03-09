package String;

public class Problem_II_6 {
    public static void main(String[] args) {
        printAllSubsequences("", "abc");
    }
    
    static void printAllSubsequences(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char first = up.charAt(0);
        printAllSubsequences(p + first, up.substring(1));
        printAllSubsequences(p, up.substring(1));
    }
}
