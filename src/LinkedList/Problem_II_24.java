package LinkedList;

public class Problem_II_24 {
    public static void main(String[] args) {

    }
    
    public static void pairsWithSum(DNode head, int sum) {
        Node first = head;
        Node last = head;
        boolean found = false;

        while (last.next != null) {
            last = last.next;
        }

        while (first != last && last.next != first) {
            // If sum of first & last is less than given sum the move first node further & vice versa if sum is greater
            if ((first.data + last.data) < sum) {
                first = first.next;
            } else if ((first.data + last.data) > sum) {
                last = last.prev;
            } else {
                found = true;
                System.out.println("(" + first.data + ", " + last.data + ")");
            }
        }
        if (found == false) {
            System.out.println("No pairs found!");
        }
    }
}
