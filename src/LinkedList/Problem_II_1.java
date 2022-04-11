package LinkedList;

import java.util.ArrayList;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Problem_II_1 {
    public static void main(String[] args) {
        // Refer gfg test cases
    }
    
    public static int getNthNodefromLast(Node head, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        return n > list.size() ? -1 : list.get(list.size() - n);
    }
}
