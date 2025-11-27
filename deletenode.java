class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to delete node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        // If head needs to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // Node not found
        if (current.next == null) return;

        // Delete node
        current.next = current.next.next;
    }

    // Function to print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Usage
public class deletenode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.printList(); // 10 -> 20 -> 30 -> null
        list.deleteByValue(20);
        list.printList(); // 10 -> 30 -> null
    }
}
