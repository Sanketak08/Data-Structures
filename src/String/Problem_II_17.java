package String;

import java.util.Stack;

public class Problem_II_17 {
    public static void main(String[] args) {
        prefixToInfix("*+AB-CD");
        postfixToInfix("abc++");
        prefixToPostfix("*+AB-CD");
        postfixToPrefix("abc++");
    }
    
    public static boolean isOperand(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return false;
        }
        return true;
    }

    public static boolean isOperator(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return false;
        }
        return true;
    }

    public static void prefixToInfix(String str) {
        Stack<String> stack = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (isOperand(ch)) {
                stack.push(ch + "");
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String temp = '(' + operand1 + ch + operand2 + ')';
                stack.push(temp);
            }
        }
        System.out.print("Prefix to Infix -> ");
        System.out.println(stack.peek());
    }

    public static void postfixToInfix(String str) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isOperand(ch)) {
                stack.push(ch + "");
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String temp = '(' + operand2 + ch + operand1 + ')';
                stack.push(temp);
            }
        }
        System.out.print("Postfix to Infix -> ");
        System.out.println(stack.peek());
    }

    public static void prefixToPostfix(String str) {
        Stack<String> stack = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (!isOperator(ch)) {
                stack.push(ch + "");
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String temp = operand1 + operand2 + ch;
                stack.push(temp);
            }
        }
        System.out.print("Prefix to Postfix -> ");
        System.out.println(stack.peek());
    }

    public static void postfixToPrefix(String str) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!isOperator(ch)) {
                stack.push(ch + "");
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String temp = ch + operand2 + operand1;
                stack.push(temp);
            }
        }
        System.out.print("Postfix to Prefix -> ");
        System.out.println(stack.peek());
    }
    
}
