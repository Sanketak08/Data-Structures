package LinkedList;

public class Problem_II_18 {
    public static void main(String[] args) {

    }
    
    public static boolean isCircular(Node head) {
        Node first = head;
        Node temp = head.next;

        while (temp != null) {
            if (temp == first) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
