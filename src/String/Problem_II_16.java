package String;

import java.util.ArrayList;
import java.util.List;

public class Problem_II_16 {
    public static void main(String[] args) {
        nextNumber(new int[] { 1, 2, 3, 4, 5, 6 }, 6);
    }
    
    public static List<Character> nextNumber(int[] arr, int N) {
        String str = "";
        List<Character> list = new ArrayList<>();
        for (int i : arr) {
            str += i + "";
        }
        
        System.out.println(str);

        return list;
    }
}
