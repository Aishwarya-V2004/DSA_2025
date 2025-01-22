package LinkedList;

//Implement the following on the SinglyLinkedList class:

//Insert

//This function should insert a node at a specified index in a  SinglyLinkedList. It should return true if the index is valid, and false if the index is invalid (less than 0 or greater the length of the list).

//Examples

 //       (Note: you do not need to re-implement push, the test will be provided with it)

//SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//singlyLinkedList.push(5);  // Success
//singlyLinkedList.push(10);  // Success
//singlyLinkedList.push(15);  // Success
//singlyLinkedList.push(20);  // Success

//singlyLinkedList.insert(12, 2);  // True
//singlyLinkedList.insert(13, 100); // False
//singlyLinkedList.size;         // 5
//singlyLinkedList.head.value;      // 5
//singlyLinkedList.head.next.value;   // 10
//singlyLinkedList.head.next.next.value;  // 12

//---------------------------------------------------------------------------------
class SinglyLL2 {
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

    public boolean insert(int data, int index) {
        if (head == null) { // If the list is empty, initialize it
            insertSinglyLinkedList(data);
            return true;
        }
        if (index < 0 || index > size) { // Validate the index
            System.out.println("Invalid index");
            return false;
        }

        Node newNode = new Node();
        newNode.value = data;

        if (index == 0) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) { // Traverse to the node before the index
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next; // Adjust pointers
            currentNode.next = newNode;

            if (index == size) { // Update tail if inserted at the end
                tail = newNode;
            }
        }
        size++; // Increment the size of the list
        return true;
    }

}
public class insertingelement_specificlocation {
    public static void main(String[] args) {
        SinglyLL2 obj = new SinglyLL2();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(20);
        System.out.println(obj.head.value);
        System.out.println(obj.head.next.value);
        System.out.println(obj.size);
        obj.insert(12, 2);  // True
        obj.insert(13, 100); // False
        System.out.println(obj.size);    // 5
        System.out.println(obj.head.next.next.value);  // 12


    }
}

