package Basic_problems;

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by
// continuously following the next pointer. Internally, pos is used to denote the index of the node that
// tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.
//Example 1:
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//Example 2:
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//Example 3:
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
//-------------------------------------------------------------------------------------------------------------------
class ListNode2 {
    int val;
    Node3 next;

    ListNode2(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Linkedlistcycle{
    public boolean hasCycle(Node3 head) {
        if (head == null || head.next == null) return false;

        Node3 slow = head;
        Node3 fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example: head = [3,2,0,-4], pos = 1
        Node3 head = new Node3(3);
        Node3 second = new Node3(2);
        Node3 third = new Node3(0);
        Node3 fourth = new Node3(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // cycle here (tail connects to second node)

        Linkedlistcycle obj = new Linkedlistcycle();
        boolean result = obj.hasCycle(head);

        System.out.println("Cycle detected: " + result); // Output: true
    }
}
