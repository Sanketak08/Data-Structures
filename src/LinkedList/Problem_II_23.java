package LinkedList;

public class Problem_II_23 {
    public static void main(String[] args) {

    }

    public static DNode reverseDoublyList(DNode head) {
        Node temp = null;
        Node curr = head;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }
}
