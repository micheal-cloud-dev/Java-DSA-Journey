class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

public static void main (String[] args){

Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);

Node current =head;
System.out.println("Before Insert the value");
while(current != null){
    System.out.println(current.data);
    current = current.next;
}

Node newHead = new Node(5);

newHead.next = head;
head = newHead;

Node temp = head;
System.out.println("After Insert the value");
while(temp != null){
    System.out.println(temp.data);
    temp = temp.next;
}

}
}
