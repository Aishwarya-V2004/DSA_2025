package leetcodeproblems;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class SwappairsusingLL {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            current.next = second;
            first.next = second.next;
            second.next = first;
            current = first;
        }

        return dummy.next;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SwappairsusingLL obj = new SwappairsusingLL();
        int[] input = {1, 2, 3, 4,5,6}; // Example input
        ListNode head = obj.createList(input);
        System.out.print("Original List: ");
        obj.printList(head);
        ListNode swapped = obj.swapPairs(head);
        System.out.print("Swapped Pairs List: ");
        obj.printList(swapped);
    }
}
