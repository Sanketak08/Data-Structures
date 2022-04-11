package LinkedList;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Problem_II_4 {
    public static void main(String[] args) {

    }
    
    public static Node reverseInGroup(Node head, int k) {
        if (head == null) {
            return null;
        }
        
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        
        if (next != null) {
            head.next = reverseInGroup(next, k);
        }

        return prev;
    }
}
