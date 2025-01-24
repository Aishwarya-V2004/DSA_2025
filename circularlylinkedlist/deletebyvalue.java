package circularlylinkedlist;
class circularlyLL1 {
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
        System.out.println(currentnode.value);
        while(currentnode.next!=head){
            currentnode=currentnode.next;
            System.out.println(currentnode.value);
        }
        return true;
    }
    public boolean deleteByValue(int value) {
        if (length == 0) {
            return false;
        }

        if (head == tail && head.value == value) {
            head = null;
            tail = null;
            length = 0;
            return true;
        }
        Node current = head;
        Node prev = null;

        do {
            if (current.value == value) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    prev.next = this.head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }

                length--;
                return true;
            }

            prev = current;
            current = current.next;
        } while (current != head);

        return false;
    }
}
public class deletebyvalue {
    public static void main(String[] args) {
        circularlyLL1 obj = new circularlyLL1();
        obj.prepend(1);
        obj.append(2);
        obj.append(3);
        obj.append(4);
        System.out.println(obj.head.value);
        System.out.println(obj.tail.value);
        obj.printlist();
        System.out.println("size of an element is "+obj.length);
        obj.deleteByValue(1);
        obj.printlist();

    }
}
