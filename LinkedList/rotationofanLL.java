package LinkedList;

//Implement the following on the SinglyLinkedList class:
//Rotate
//This function should rotate all the nodes in the list by some number passed in. For instance, if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2. The number passed in  to rotate can be any integer.

//Time Complexity : O(N), where N is the length of the list.
//Space Complexity : O(1)
//Examples
//(Note: you do not need to re-implement push, the test will be provided with it)
//singlyLinkedList = SinglyLinkedList()
//singlyLinkedList.push(5)  // Success
//singlyLinkedList.push(10)  // Success
//singlyLinkedList.push(15)  // Success
//singlyLinkedList.push(20)  // Success
//singlyLinkedList.push(25)  // Success
//singlyLinkedList.rotate(3)

//singlyLinkedList.head.value  // 20
//singlyLinkedList.head.next.value   // 25
//singlyLinkedList.head.next.next.value  // 5
//singlyLinkedList.head.next.next.next.value // 10
//singlyLinkedList.head.next.next.next.next.value // 15
//singlyLinkedList.tail.value // 15
//--------------------------------------------------------------------------------

class SinglyLL4 {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) { //creating a sinlylinkedlist
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void push(int nodeValue) {
        if (head == null) {  //for empty linkedlist
            insertSinglyLinkedList(nodeValue);
            return;
        } else {  //if elements were there already
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public String rotate(int number) {
        int index = number;
        if (number < 0) {
            index = number + size;
        }
        if (index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            return "No Rotation";
        }
        Node prevNode = head;
        for(int i=0; i<index-1; i++) {
            prevNode = prevNode.next;
        }
        if (prevNode == null) {
            return "No Rotation";
        }
        tail.next = head;
        head = prevNode.next;
        tail = prevNode;
        prevNode.next = null;
        return "Success";
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


}

public class rotationofanLL {
    public static void main(String[] args) {
        SinglyLL4 obj = new SinglyLL4();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.rotate(2));
        obj.printList();
    }
}