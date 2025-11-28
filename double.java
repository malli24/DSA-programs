class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class queuemethod{
    private node front;
    private node rare;
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
}
public void  dequeue(){
    if(front == null){
        System.out.println("queue is empty!");
        return;
    }
     int value = front.data;
        front = front.next;

        if (front != null)
            front.prev = null;
        else
            rear = null;

        return value;
    }
public void  display(){
     Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public class double {
    public static void main(String[] args) {
        DoublyLinkedQueue q = new DoublyLinkedQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 <-> 20 <-> 30 <-> NULL

        System.out.println("Dequeued: " + q.dequeue());

        q.display();
}
}