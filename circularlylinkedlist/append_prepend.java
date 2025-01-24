package circularlylinkedlist;

class Node{
    Node next;
    int value;
}
class circularlyLL {
    Node head = null;
    Node tail = null;
    int length = 0;
    int size=0;
    public Node prepend(int value) {
        Node newnode = new Node();
        newnode.value= value;
        if (length == 0) {//adding numbers at first
            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
        }
        else{
            newnode.next= head;
            head= newnode;
            tail.next=newnode;

        }
        size++;
        length++;
        return newnode;

    }
    public Node append(int value) {
        Node newnode = new Node();
        newnode.value= value;
        if (length == 0) {//adding numbers at first
            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
        }
        else{
            tail.next=newnode;
            newnode.next=head;
            tail=newnode;

        }

        length++;
        return newnode;

    }
    boolean printlist(){
        Node currentnode=head;
        System.out.println("list of the elements");
        System.out.println(currentnode.value+"->");
        while(currentnode.next!=head){
            currentnode=currentnode.next;
            System.out.println(currentnode.value+"->");
        }
        return true;
    }

}
public class append_prepend {
    public static void main(String[] args) {
        circularlyLL obj = new circularlyLL();
        System.out.println("for prepend");
        obj.prepend(10);
        obj.prepend(20);
        System.out.println(obj.head.value);
        System.out.println(obj.tail.value);
        System.out.println("for append");
        obj.append(1);
        obj.append(2);
        System.out.println(obj.head.value);
        System.out.println(obj.tail.value);
        obj.printlist();
        System.out.println("size of an element "+obj.length);

    }
}
