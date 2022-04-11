package LinkedList;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Problem_II_2 {
    public static void main(String[] args) {
        // Refer gfg for test cases
        // This problem can be solved by using two pointers approach 
        // & by reversing the linked list
    }
    
    public static boolean isStringPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(Node head) {
        String result = "";

        Node temp = head;
        while (temp != null) {
            result = result + Integer.toString(temp.data);
            temp = temp.next;
        }
        return isStringPalindrome(result);
    }
}
