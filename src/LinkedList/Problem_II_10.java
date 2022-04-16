package LinkedList;

public class Problem_II_10 {
    public static void main(String[] args) {

    }
    
    public static void lastNodeToFront(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = head;
    }
}
