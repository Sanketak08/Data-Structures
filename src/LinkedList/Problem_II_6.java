package LinkedList;

public class Problem_II_6 {
    public static void main(String[] args) {

    }

    public static int lengthOfLoop(Node head) {
        int length = 1;
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = slow;

                while (temp.next != slow) {
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }
        return 0;
    }
}
