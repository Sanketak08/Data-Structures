package LinkedList;

public class Problem_II_25 {
    public static void main(String[] args) {

    }
    
    public static int countTriplets(DNode head, int sum) {
        DNode first, last, curr;
        int count = 0;
        last = head;

        while (last.next != null) {
            last = last.next;
        }

        for (curr = head; curr != null; curr = curr.next) {
            first = curr.next;
            count += countPairs(first, last, sum - first.data);
        }
        return count;
    }

    public static int countPairs(DNode first, DNode second, int value) {
        int count = 0;

        while (first != null && second != null && first != second && second.next != first) {
            if ((first.data + second.data) == value) {
                count++;
            } else if ((first.data + second.data) > value) {
                second = second.prev;
            } else {
                first = first.next;
            }
        }
        return count;
    }
}
