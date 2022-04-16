package LinkedList;

import java.util.HashSet;

public class Problem_II_5 {
    public static void main(String[] args) {

    }

    public static boolean detectLoop(Node head) {
        HashSet<Node> s = new HashSet<Node>();
        while (head != null) {
            
            if (s.contains(head)) {
                return true;
            }
            s.add(head);
            head = head.next;
        }

        return false;
    }
}
