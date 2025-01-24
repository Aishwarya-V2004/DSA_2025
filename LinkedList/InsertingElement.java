package LinkedList;

//Implement the following on the SinglyLinkedList class:
//This function should take in a value and add o node to the end of the SinglyLinkedList.
//Examples:
//SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//singlyLinkedList.push(5)  // Success
//singlyLinkedList.size   // 1
//singlyLinkedList.head.value // 5
//singlyLinkedList.tail.value // 5

//singlyLinkedList.push(10)    // Success
//singlyLinkedList.size      // 2
//singlyLinkedList.head.value    // 5
//singlyLinkedList.head.next.value  // 10
//singlyLinkedList.tail.value    // 10
//----------------------------------------------------------------------


class Node{
    public Node next;
    public int value;
}
class SinglyLL {
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

}

public class InsertingElement {
    public static void main(String[] args) {
        SinglyLL obj = new SinglyLL();
        obj.push(5);
        System.out.println(obj.head.value);
        System.out.println(obj.size);
        obj.push(10);
        System.out.println(obj.head.next.value);
        System.out.println(obj.size);
    }
}