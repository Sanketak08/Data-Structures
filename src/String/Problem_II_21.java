package String;

import java.util.Stack;

public class Problem_II_21 {
    public static void main(String[] args) {
        System.out.println(reversalsCount("}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}"));
    }
    
    public static int reversalsCount(String s) {
        int len = s.length();

        if (len % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '}' && !stack.empty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        
        int newLen = stack.size();

        int n = 0;
        while (!stack.empty() && stack.peek() == '{') {
            stack.pop();
            n++;
        }

        return (newLen / 2 + n % 2);
    }
}
