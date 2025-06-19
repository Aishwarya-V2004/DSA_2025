package Basic_problems;

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
// following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
// is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.
//Example :
//Input: head = [3,2,0,-4], pos = 1(this is for understanding)
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
// [1,2,3,2,3,2,3] -> cycle ; [1,2,3,4] -> no cycle
//----------------------------------------------------------------------------------------------------------------

// Definition for singly-linked list
class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class Detectcycle {

    // Function to detect if a cycle exists
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true; // cycle detected
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Link nodes to form: 1 → 2 → 3 → 4 → null
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null; // No cycle
        // Run cycle detection
        boolean hasCycle = hasCycle(node1);

        // Print result
        System.out.println("Cycle exists? " + hasCycle); // Expected: false
    }
}
