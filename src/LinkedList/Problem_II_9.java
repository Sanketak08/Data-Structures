package LinkedList;

import java.util.HashSet;

public class Problem_II_9 {
    public static void main(String[] args) {

    }
    
    public static Node removeDuplicatesUnsorted(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (set.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }

        return head;
    }
}
