package leetcodeproblems;
class MergeNode {
    int val;
    MergeNode next;

    MergeNode() {}
    MergeNode(int val) { this.val = val; }
    MergeNode(int val, MergeNode next) { this.val = val; this.next = next; }
}
public class MergeSortedLists {
    // ✅ Merge two sorted linked lists
    public static MergeNode mergeTwoLists(MergeNode list1, MergeNode list2) {
        MergeNode dummy = new MergeNode(-1);
        MergeNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
    public static void printList(MergeNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeNode list1 = new MergeNode(1, new MergeNode(2, new MergeNode(4)));
        MergeNode list2 = new MergeNode(1, new MergeNode(3, new MergeNode(4)));
        MergeNode merged = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(merged);
    }
}

