public class DFS_TreeTraversal {
 static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
 public static void preorder(Node root){
    if(root == null){
        return;
    }
        System.out.print(root.data+" ");  // Root
        preorder(root.left);                // Left
        preorder(root.right);               // Right
    }
 public static void inorder(Node root){
    if(root == null){
      return;
    }
    inorder(root.left);                     // Left
    System.out.print(root.data+" ");      // Root
    inorder(root.right);                    // Right
 }
 public static void postorder(Node root){
    if(root == null){
        return;
    }
    postorder(root.left);                  // Left
    postorder(root.right);                 // Right
    System.out.print(root.data+" ");     // Root
 }
//public class DFS_TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);            // Root Node
        root.left = new Node(2);            //left child Node
        root.right= new Node(3);            //right child Node
          
        root.left.left = new Node(4);       //creating child node for Node 2
        root.left.right= new Node(5);

        root.right.left = new Node(6);      // creating child node for node 3
        root.right.right = new Node(7);
    
        System.out.println("Preorder Traversal");
        preorder(root); //Root--> Left--> Right

        System.out.println();
        System.out.println("Inorder Traversal");
        inorder(root);  // Left--> Root--> Right

        System.out.println();
        System.out.println("Postorder Traversal");
        postorder(root); // Left--> Right--> Root
       
    }
}
