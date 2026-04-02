class Node{
    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
   }
  
    public static Node DeleteAtEnd(Node head){
    if(head == null){
        System.out.println("List is Empty");
        return null;
    }
    if (head.next == null){
        return null;
    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
     }
     temp.next = null;
     return head;

  }
   static void printList(Node head){

    Node temp = head;
    while(temp != null){
        System.out.println(temp.data);
        temp=temp.next;
    }
  }
public static void main(String[] args){
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    System.out.println("Before delete at End value");
    printList(head);

    head = DeleteAtEnd(head);

    System.out.println("After delete at End value");
    printList(head);
    
  }
}
