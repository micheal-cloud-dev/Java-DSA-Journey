public class Insert_BST {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=right=null;
        }
    }
    public static Node insert(Node root,int value){
        if(root == null){
            return new Node(value);
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        else if(value>root.data){
            root.right=insert(root.right,value);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
    }
public static void main(String[] args) {
    Node root = null;

    root=insert(root,5);
    insert(root,3);
    insert(root,7);
    insert(root,2);
    insert(root,4);
    insert(root,6);
    insert(root,8);

    System.out.println("Inorder Traversal:");
    inorder(root);
 }
}
