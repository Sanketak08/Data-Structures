package LinkedList;

public class Problem_II_27 {
    public static void main(String[] args) {

    }
    
    public static DNode rotateDLL(DNode head, int n) {
        if (head == null) {
            return head;
        }

        DNode first = head, second = null, temp = null;

        for (int i = 0; i < n - 1; i++) {
            first = first.next;
        }

        second = first.next;
        temp = first.next;

        while (second.next != null) {
            second = second.next;
        }

        first.next = null;
        second.next = head;
        temp.prev = null;
        head = temp;

        return head;
    }
}
