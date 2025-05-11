package leetcodeproblems;

//Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
// leaving only distinct numbers from the original list. Return the linked list sorted as well.
//Example 1:
//Input: head = [1,2,3,3,4,4,5]
//Output: [1,2,5]
//Example 2:
//Input: head = [1,1,1,2,3]
//Output: [2,3]
//-----------------------------------------------------------------------------------------------------

class Node1 {
    int val;
    Node1 next;
    Node1() {}
    Node1(int val) { this.val = val; }
    Node1(int val, Node1 next) { this.val = val; this.next = next; }
}

public class RemoveDuplicates {
    public static Node1 deleteDuplicates(Node1 head) {
        Node1 dummy = new Node1(0, head);
        Node1 prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next; // skip all duplicates
            } else {
                prev = prev.next; // no duplicates, move prev
            }
            head = head.next;
        }

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(Node1 head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a list from an array
    public static Node1 createList(int[] arr) {
        Node1 dummy = new Node1(0);
        Node1 current = dummy;
        for (int num : arr) {
            current.next = new Node1(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 3, 4, 4, 5};
        int[] input2 = {1, 1, 1, 2, 3};

        Node1 head1 = createList(input1);
        Node1 head2 = createList(input2);

        System.out.print("Input 1: ");
        printList(head1);
        Node1 result1 = deleteDuplicates(head1);
        System.out.print("Output 1: ");
        printList(result1);

        System.out.print("\nInput 2: ");
        printList(head2);
        Node1 result2 = deleteDuplicates(head2);
        System.out.print("Output 2: ");
        printList(result2);
    }
}
