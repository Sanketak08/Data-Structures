package LinkedList;

import java.util.HashSet;

public class Problem_II_14 {
    public static void main(String[] args) {

    }
    
    // Alernative Method => Count nodes of each list and calculate difference.
    // Then traverse bigger list till the difference no. of nodes and then traverse both
    // lists in parallel manner and compare data.If data is same then return node else return -1
    public static int findIntersectionPoint(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();
        Node temp1 = head1;
        Node temp2 = head2;
        
        while (temp1 != null) {
            set.add(temp1);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (set.contains(temp2)) {
                return temp2.data;
            }
            set.add(temp2);
            temp2 = temp2.next;
        }
        return -1;
    }
}
