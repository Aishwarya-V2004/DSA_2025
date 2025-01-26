package Stack;

class Stack_method1 {
    private Node peak; // Reference to the top of the stack
    private int length; // Tracks the size of the stack
    public Stack_method1() {
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
    public Node pop() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.peak;
        this.peak = this.peak.next;
        temp.next = null;
        this.length--;
        return temp;
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
public class pop_linkedlist {
    public static void main(String[] args) {
        Stack_method1 obj = new Stack_method1();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("Stack after pushes:");
        obj.displayStack();
        Node poppedNode = obj.pop();
        if (poppedNode != null) {
            System.out.println("Popped value: " + poppedNode.value);
        }
        System.out.println("Stack after pop:");
        obj.displayStack();
        poppedNode = obj.pop();
        if (poppedNode != null) {
            System.out.println("Popped value: " + poppedNode.value);
        }
        System.out.println("Stack after second pop:");
        obj.displayStack();
    }
}