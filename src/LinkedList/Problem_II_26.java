package LinkedList;

import java.util.PriorityQueue;

public class Problem_II_26 {
    public static void main(String[] args) {

    }

    public static DNode sortDLL(DNode head, int k) {
        if (head == null) {
            return head;
        }

        PriorityQueue<DNode> pq = new PriorityQueue<>();
        DNode newHead = null;
        DNode last = null;

        // Creating min heap of first "k" elements in linked list
        for (int i = 0; head != null && i < k + 1; i++) {
            pq.add(head);
            head = head.next;
        }

        while (!pq.isEmpty()) {
            if (newHead == null) {
                newHead = pq.peek();
                newHead.prev = null;
                last = newHead;
            } else {
                last.next = pq.peek();
                pq.peek().prev = last;
                last = pq.peek();
            }
            pq.poll();

            // If there are nodes in the list
            if (head != null) {
                pq.add(head);
                head = head.next;
            }

        }
        return newHead;

    }
}
