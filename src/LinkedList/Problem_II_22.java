package LinkedList;

public class Problem_II_22 {
    public static void main(String[] args) {

    }
    
    public static Node exchangeFirstandLast(Node head) {
        // If list contains two nodes
        if (head.next.next == head) {
            head = head.next;
            return head;
        }
        
        Node prev = head;
        while (prev.next.next != head) {
            prev = prev.next;
        }
        
        prev.next.next = head.next;
        head.next = prev.next;
        prev.next = head;
        head = head.next;
 
        return head;
    }
}
