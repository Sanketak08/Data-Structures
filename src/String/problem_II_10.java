package String;

import java.util.HashMap;
import java.util.HashSet;

public class problem_II_10 {
    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(smallestWindow(str));
    }
    
    public static String smallestWindow(String str) {
        int len = str.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        int i = -1;
        int j = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;

            // Acquire till it is invalid (map.size() == set.size())
            while (i < str.length() - 1 && map.size() < set.size()) {
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                flag1 = true;
            }

            // If map.size() == set.size() we'll have to release characters
            // from left (leftIndex == j)
            while (j < i && map.size() == set.size()) {
                int tempLen = i - 1;
                len = Math.min(len, tempLen);
                j++;

                char ch = str.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                flag2 = true;
            }

            if (flag1 == false && flag2 == false) {
                break;
            }
        }
        return Integer.toString(len - 1);
    }
}
