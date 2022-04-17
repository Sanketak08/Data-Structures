package LinkedList;

public class Problem_II_12 {
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

    public static Node addTwoLists(Node first, Node second) {
        first = reverseLinkedlist(first);
        second = reverseLinkedlist(second);

        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (first != null || second != null || carry == 1) {
            int sum = 0;

            if (first != null) {
                sum += first.data;
                first = first.next;
            }

            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            sum += carry;
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            tem = temp.next;
        }

        temp = reverseLinkedlist(dummy.next);

        return temp;
    }
}
