package String;

import java.util.Stack;

public class Problem_II_19 {
    public static void main(String[] args) {
        System.out.println(balancedParantheses("({{]}})"));
    }
    
    public static boolean balancedParantheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == '{') {
                stack.push(ch);
            } else if (ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}
