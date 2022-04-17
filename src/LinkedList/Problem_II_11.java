package LinkedList;

public class Problem_II_11 {
    public static void main(String[] args) {

    }

    public static Node reverseLinkedlist(Node head) {
        Node prev = null;
        Node next = null;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        return head;
    }
    
    public static Node addOne(Node head) {
        if (head == null) {
            new Node(1);
        }

        head = reverseLinkedlist(head);
        int carry = 1;
        Node curr = head;

        while (carry > 0) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;

            if (curr.next == null) {
                break;
            }
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new Node(carry);
        }

        head = reverseLinkedlist(head);

        return head;
    }
}
