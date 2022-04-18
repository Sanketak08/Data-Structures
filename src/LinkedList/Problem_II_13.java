package LinkedList;

import java.util.HashMap;

public class Problem_II_13 {
    public static void main(String[] args) {

    }

    public static Node findIntersection(Node head1, Node head2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp1 = head1;
        Node temp2 = head2;
        int len1 = 0;
        int len2 = 0;

        while (temp1 != null) {
            map.put(temp1.data, map.getOrDefault(temp1.data, 0) + 1);
            len1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            map.put(temp2.data, map.getOrDefault(temp2.data, 0) + 1);
            len2++;
            temp2 = temp2.next;
        }

        Node result = new Node(0);
        Node dummy = result;
        temp1 = head1;
        temp2 = head2;
        if (len1 >= len2) {
            for (int i = 0; i < len1; i++) {
                if (temp1 == null) {
                    break;
                }

                if (map.containsKey(temp1.data)) {
                    if (map.get(temp1.data) > 1) {
                        dummy.next = new Node(temp1.data);
                        dummy = dummy.next;
                        map.remove(temp1.data);
                    }
                }
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < len2; i++) {
                if (temp2 == null) {
                    break;
                }

                if (map.containsKey(temp2.data)) {
                    if (map.get(temp2.data) > 1) {
                        dummy.next = new Node(temp2.data);
                        dummy = dummy.next;
                        map.remove(temp2.data);
                    }
                }
                temp2 = temp2.next;
            }
        }

        return result.next;
    }
}
