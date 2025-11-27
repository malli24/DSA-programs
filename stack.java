class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    private static Node top = null;

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    public static void topValue() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top value: " + top.data);
    }

    public static void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class stack {
    public static void main(String[] args) {
        StackLL.push(10);
        StackLL.push(20);
        StackLL.push(30);

        StackLL.display();   
        StackLL.topValue(); 
        StackLL.pop();       
        StackLL.display();  
    }
}