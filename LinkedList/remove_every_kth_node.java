package LinkedList;
// Method to delete every k-th node from the linked list

class Remove {

    Node deleteK(Node head, int k) {
        if (head == null || k <= 0)
            return head;

        Node curr = head;
        Node prev = null;
        int count = 0;

        while (curr != null) {
            count++;
            if (count % k == 0) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    //to print the linked list
    void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class remove_every_kth_node {
    public static void main(String[] args) {
        Remove obj = new Remove();

        // Creating the linked list manually
        Node head = new Node(); // Assuming Node has a default constructor
        head.value = 1;

        Node second = new Node();
        second.value = 2;
        head.next = second;

        Node third = new Node();
        third.value = 3;
        second.next = third;

        Node fourth = new Node();
        fourth.value = 4;
        third.next = fourth;

        Node fifth = new Node();
        fifth.value = 5;
        fourth.next = fifth;

        Node sixth = new Node();
        sixth.value = 6;
        fifth.next = sixth;

        int k = 2; // Specify k
        System.out.println("Original List:");
        obj.printList(head);

        // Deleting every k-th node
        head = obj.deleteK(head, k);

        System.out.println("List after deleting every k-th node:");
        obj.printList(head);
    }
}
