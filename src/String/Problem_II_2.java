package String;

import java.util.LinkedHashSet;

public class Problem_II_2 {
    public static void main(String[] args) {
        removeDuplicates("anketttasa");
    }
    
    static void removeDuplicates(String s1) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (Character character : set) {
            System.out.print(character);
        }
    }
}
