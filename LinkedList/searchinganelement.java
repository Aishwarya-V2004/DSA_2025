package LinkedList;

//Implement the following on the SinglyLinkedList class:
//get method
//This function should find a node at a specified index in a  SinglyLinkedList. It should return the found node.

//Examples
//singlyLinkedList = SinglyLinkedList();
//singlyLinkedList.push(5);  // Success
//singlyLinkedList.push(10);  // Success
//singlyLinkedList.push(15);  // Success
//singlyLinkedList.push(20);  // Success

//singlyLinkedList.get(0).value;    // 5
//singlyLinkedList.get(1).value;    // 10
//singlyLinkedList.get(2).value;   // 15
//singlyLinkedList.get(3).value;    // 20
//singlyLinkedList.get(4).value;    // Null

//---------------------------------------------------------------------------------
class SinglyLL3 {
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
    //get
    public Node get(int index) {

            if (index < 0 || index >= size) {
                return null;
            }
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode;

        }
    }


public class searchinganelement {
    public static void main(String[] args) {
        SinglyLL3 obj = new SinglyLL3();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.get(0).value);
        System.out.println(obj.get(1).value);


    }
}
