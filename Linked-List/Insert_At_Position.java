class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public class InsertAtPosition{
     static Node insertAtPosition(Node head,int position,int Insertvalue){
        Node newNode = new Node(Insertvalue);
        //insert at Beginning
        if(position == 0){
           newNode.next = head;
           return newNode;
        }
        //traverse to position-1
        Node temp = head;
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        //Insert the Node
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
public static void show(Node head){
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data+ "-->");
        temp = temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args){
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);

    int position = 2;
    int InsertValue = 25;

    head = insertAtPosition(head,position,InsertValue);

    show(head);
  }
}
