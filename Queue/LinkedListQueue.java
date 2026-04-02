public class QueueLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

void enqueue(int value){
    Node newNode=new Node(value);
    if(rear==null){
        front=rear=newNode;
        System.out.print(value+ " ");
        return;
    }
    rear.next=newNode;                     // link last Node to new Node
    rear=newNode;                          // move rear to newNode
    System.out.print(value+ " ");
 }
 void dequeue(){
    if(front==null){                       // check if Queue is Empty
        System.out.println("Queue is Empty");
        return;
    }
    System.out.print(front.data+" ");
    front=front.next;
    if(front==null){
        rear=null;
    }
 }
 void peek(){                             
    if(front==null){                       // check if Queue is Empty
        System.out.println("Queue is Empty");
        return;
    }
    System.out.println(rear.data);
 }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        System.out.println("The enqueue value are:");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println();
        System.out.println("The dequeue value is:");
        q.dequeue();
        System.out.println();
        System.out.println("The Peek value is:");
        q.peek();
    }
    
}
