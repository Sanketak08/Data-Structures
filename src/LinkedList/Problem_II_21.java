package LinkedList;

public class Problem_II_21 {
    public static void main(String[] args) {

    }
    
    public static int countNodesInCircular(Node head) {
        Node first = head;
        Node temp = head;
        int count = 0;
        
        // Here do while loop is used because it executes the code first and then checks for the condition, If while loop is used then we need to make some changes in code
        if (head != null) { 
            do {
                count++;
                temp = temp.next;
            } while (temp != first);
        }

        return count;
    }
}
