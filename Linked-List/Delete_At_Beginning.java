class Node {
	
	int data;
	Node  nextNode;
	
	Node(int data){
		this.data=data;
		this.nextNode=null;
	}
	
	public static void printList(Node headNode) {
		Node tempNode=headNode;
		while(tempNode!=null) {
			System.out.print(tempNode.data+ " ");
			tempNode=tempNode.nextNode;
		}

	}
	
	 static Node delete(Node headNode) {
		
		if(headNode==null) {
			System.out.println("empty");
			return null;
		}	
		
		Node tempNode=headNode;
		headNode=headNode.nextNode;
		tempNode=null;
		
		return headNode;
	}
	public static void main(String[] args) {
		Node headNode=new Node(10);
		headNode.nextNode=new Node(20);
		headNode.nextNode.nextNode=new Node(30);
		
		System.out.println("before delete the value:");
		printList(headNode);
		
		headNode=delete(headNode);
		
		System.out.println();
		System.out.println("After delete the value:");
		printList(headNode);
	
		

	}
}
