package LinkedList;

public class Problem_II_17 {
    public static void main(String[] args) {

    }
    
    public static int getMiddle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow.data;
    }
}
