class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
   
public class Reversel{
    static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
          return prev;
    }
static void Disply(Node head){
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data+"->");
        temp = temp.next;
    }
}
public static void main(String[] args){
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    System.out.println("Before Reversal");
    Disply(head);

    head = reverse(head);

    System.out.println();
    System.out.println("After Reversal");
    Disply(head);

 }
}
