package LinkedList;

//Singly Linked List - Pop
//Implement the following on the SinglyLinkedList class:
//This function should remove a node at the end of the SinglyLinkedList. It should return the node removed.
//Examples
//SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//singlyLinkedList.push(5);
//singlyLinkedList.push(10);

//singlyLinkedList.pop().value // 10
//singlyLinkedList.tail.value  // 5
//singlyLinkedList.size;   // 1
//singlyLinkedList.pop().value; // 5
//singlyLinkedList.size;   // 0
//singlyLinkedList.pop()   // The SLL does not exist
//----------------------------------------------------------------------------

class SinglyLL1 {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
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
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;
        return removeNode;
    }

}


public class popaelement {
    public static void main(String[] args) {
        SinglyLL1 obj = new SinglyLL1();
        obj.insertSinglyLinkedList(5);
        obj.push(10);
        System.out.println(obj.head.value);
        System.out.println(obj.head.next.value);
        System.out.println(obj.pop().value);
        obj.pop();
    }

}
