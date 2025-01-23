package LinkedList;

//Implement a function on the SinglyLinkedList class which should remove a node at a specified index in a SinglyLinkedList. If the index is valid it should return the removed node otherwise it should return null.

//Example

//SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//singlyLinkedList.push(5);  // Success
//singlyLinkedList.push(10);  // Success
//singlyLinkedList.push(15);  // Success
//singlyLinkedList.push(20);  // Success
//singlyLinkedList.push(25)  // Success
//singlyLinkedList.remove(2).value // 15
//singlyLinkedList.remove(100) // null
//singlyLinkedList.sizesinglyLinkedList.remove(2).value   // 4
//singlyLinkedList.head.value   // 5
//singlyLinkedList.head.next.value  // 10
//singlyLinkedList.head.next.next.value  // 20

//---------------------------------------------------------------------------------

class SinglyLL5 {
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



    //Remove
    public Node remove(int index) {
        if (index<0 || index >= size) {
            return null;
        }
        Node removeNode;
        Node currentNode;
        size--;
        if (index == 0) {
            removeNode = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return removeNode;
        } else {
            currentNode = head;
            int indx = 0;
            while (indx < index - 1) {
                currentNode = currentNode.next;
                indx ++;
            }
            removeNode = currentNode.next;
            Node nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            return removeNode;


        }
    }



}
public class removeelement_specificlocation {
    public static void main(String[] args) {
        SinglyLL5 obj = new SinglyLL5();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(20);
        obj.remove(0);
        System.out.println(obj.head.value);


    }
}

