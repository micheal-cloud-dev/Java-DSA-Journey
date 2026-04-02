class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}
public class DeleteByValue{
    static Node deleteAtValue(Node head,int value){
        // if the list is empty
        if(head == null){
            System.out.println("List is not Empty");
            return head;
        }
        // if the head node itself has the value
        if(head.data == value){
            head = head.next;
            return head;
        }
        // traverse to find the value
        Node temp = head;
        while(temp.next != null && temp.next.data != value){
        temp = temp.next;
        }
        //value found
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        else{
            System.out.println("value not found");
        }
        return head;
    }

public static void display(Node head){
    Node temp = head;
    while(temp != null){
    System.out.print(temp.data+" -> ");
    temp = temp.next;
   }
   System.out.print("null");
}
public static void main(String[] args){
    Node head = new Node(10);
    head.next = new Node(15);
    head.next.next = new Node(20);
    head.next.next.next = new Node(30);

    System.out.println("Before delete the value");
    display(head);

    head = deleteAtValue(head,15);

     System.out.println();
    System.out.println("After delete the value");
    display(head);
  }
}
