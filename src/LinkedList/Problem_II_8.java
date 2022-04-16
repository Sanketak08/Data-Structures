package LinkedList;

public class Problem_II_8 {
    public static void main(String[] args) {

    }
    
    public static Node removeDuplicates(Node head) {
        Node curr = head;

        while (curr != null) {
            Node temp = curr;
            
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }

        return head;
    }
}
