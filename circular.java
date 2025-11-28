class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // INSERT AT END
    public void insertend(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular link
            return;
        }

        // If list already has nodes
        tail.next = newNode;
        tail = newNode;
        tail.next = head; // maintain circular nature
    }

    // DISPLAY LIST
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

public class circular {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertend(10);
        cll.insertend(20);
        cll.insertend(30);

        cll.display();  
    }
}
