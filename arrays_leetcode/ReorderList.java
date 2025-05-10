package arrays_leetcode;

//You are given the head of a singly linked-list. The list can be represented as:
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//Example 1;
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
//Example 2:
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
//-------------------------------------------------------------------------------------------------------------------
class Node1 {
    int val;
    Node1 next;
    Node1(int x) { val = x; }
}

public class ReorderList {
    public void reorderList(Node1 head) {
        if (head == null || head.next == null) return;

        Node1 slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node1 second = reverse(slow.next);
        slow.next = null;

        Node1 first = head;
        while (second != null) {
            Node1 tmp1 = first.next;
            Node1 tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }

    private Node1 reverse(Node1 head) {
        Node1 prev = null;
        while (head != null) {
            Node1 nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
                                         // Creating the list: 1 -> 2 -> 3 -> 4 -> 5
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);
        ReorderList rl = new ReorderList();
        rl.reorderList(head);
        Node1 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
