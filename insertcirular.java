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

        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // circular link
            return;
        }

        // Case 2: List already has nodes
        tail.next = newNode;   // last node points to new node
        tail = newNode;        // update tail
        tail.next = head;      // new tail points to head
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
        } while (temp != head);  // stop when loop reaches the head again

        System.out.println();
    }
}

public class insertcirular {
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertend(10);
        cll.insertend(20);
        cll.insertend(30);
        cll.insertend(40);

        cll.display();   // OUTPUT: 10 20 30 40
    }
}
