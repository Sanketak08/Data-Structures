package String;

import java.util.ArrayList;
import java.util.Collections;

public class Problem_II_7 {
    public static void main(String[] args) {
        ArrayList<String> resultSet = new ArrayList<>();
        printPermutations("", "ABC", resultSet);
        Collections.sort(resultSet);
        for (String string : resultSet) {
            System.out.print(string + " ");
        }
    }
    
    static void printPermutations(String p, String up, ArrayList<String> set) {
        if (up.length() == 0) {
            set.add(p);
            return;
        }

        char first = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            printPermutations(f + first + s, up.substring(1), set);
        }
    }
}
