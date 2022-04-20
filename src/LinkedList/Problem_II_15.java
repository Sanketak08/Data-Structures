package LinkedList;

public class Problem_II_15 {
    public static void main(String[] args) {

    }
    
    public static Node mergeSortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddleNode(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSortList(head);
        Node right = mergeSortList(nextOfMiddle);

        Node sorted = sortedMerge(left, right);
        return sorted;
    }

    public static Node sortedMerge(Node a, Node b) {
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        Node result = null;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node getMiddleNode(Node head) {
        if(head==null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
