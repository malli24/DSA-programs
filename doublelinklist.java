// Node class
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedListMethods {
    private Node head = null;
    private Node tail = null;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) { 
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }
    public void deleteAtEnd() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }
    public void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void displayBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
}
public class doublelinklist{
    public static void main(String[] args) {

        DoublyLinkedListMethods dll = new DoublyLinkedListMethods();

        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Forward:");
        dll.displayForward();      

        System.out.println("Backward:");
        dll.displayBackward();

        dll.deleteAtBeginning();
        System.out.println("After deleting at beginning:");
        dll.displayForward();

        dll.deleteAtEnd();
        System.out.println("After deleting at end:");
        dll.displayForward();
    }
}
