import java.util.*;
public class BFS_TreeTraversal{
    static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
 }
 public static void levelorder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();           // Create a Queue

    q.add(root);                                  // Add root to queue
    while(!q.isEmpty()){                          // Loop until queue is empty
        Node current = q.poll();                  // Remove elm from front
        System.out.print(current.data+" ");

        if(current.left != null){                 // Add left child to queue
            q.add(current.left);
        }
        if(current.right != null){                // Add right child to queue
            q.add(current.right);
        }
    }
 }
 public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);

    root.right.left = new Node(6);
    root.right.right= new Node(7);

    System.out.println("Level Oder Traversal:");
    levelorder(root);
 }
    

}
