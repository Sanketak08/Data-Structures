package LinkedList;

public class Problem_II_20 {
    public static void main(String[] args) {

    }
    
    public static Node deletionInCircular(Node head, int key) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        Node prev = null;

        // Finding the node to delete
        while (temp.data != key) {
            if (temp.next == head) {
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        // Checking if that is the only node in list
        if (temp == head && temp.next == head) {
            head = null;
            return head;
        }

        // If that node is head
        if (temp == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = temp.next;
            prev.next = head;
        }else if (curr.next == head) { // If that node is last node
            prev.next = head;
        }
        else { // If that node is in between
            prev.next = curr.next;
        }

        return head;
    }
}
