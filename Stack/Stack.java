package Stack;

//Develop a method named push to place a new node with a specified value at the peak of the stack.
//Return type: void
//The method should complete these steps:
//Receive a numerical value (integer) which is assigned to the new node.
//Generate a new Node entity named addedNode using the specified value.
//In case the stack's length is 0, adjust the peak reference to the addedNode.
//For stacks with a depth exceeding 0, execute these steps:
//a. Direct the next reference of the addedNode towards the current peak node.
//b. Modify the peak reference to indicate the addedNode.
//Augment the length value of the stack by one unit.
//----------------------------------------------------------------------

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class Stack_method {
    private Node peak;
    private int length;


    public Stack_method() {
        this.peak = null;
        this.length = 0;
    }

    public void push(int value) {
        Node addedNode = new Node(value);


        if (this.length == 0) {
            this.peak = addedNode;
        } else {
            addedNode.next = this.peak;
            this.peak = addedNode;
        }
        this.length++;
    }
    public void displayStack() {
        Node current = this.peak;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int getLength() {
        return this.length;
    }
}


public class Stack {
    public static void main(String[] args) {
        Stack_method obj = new Stack_method();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("Stack after pushes:");
        obj.displayStack();
        System.out.println("Stack length: " + obj.getLength());
    }
}