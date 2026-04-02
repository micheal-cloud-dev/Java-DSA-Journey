class Insert_At_End{
 static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    static Node InsertAtEnd(Node head,int data){
           Node newNode = new Node(data);

           if(head == null){
              return newNode;
           }
           Node temp = head;
           while(temp.next != null){
            temp = temp.next;
           }

           temp.next = newNode;
           return head;
        }
    
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
     }
    public static void main(String[] args){

        Node head = null;

        head = InsertAtEnd(head,10);
        head = InsertAtEnd(head,20);
        head = InsertAtEnd(head,30);

        display(head);
    }
}
