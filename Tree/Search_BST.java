public class Search_BST {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=right=null;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null)
            return new Node(value);
        if(value < root.data)
            root.left = insert(root.left,value);
        else if(value > root.data)
            root.right = insert(root.right,value);

        return root;
    }
    public static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(root.data==key)
            return true;

        if(key < root.data)
            return search(root.left,key);
        else
            return search(root.right,key);
    }
public static void main(String[] args) {
        Node root=null;

        root = insert(root,5);
        insert(root,3);
        insert(root,7);
        insert(root,2);
        insert(root,4);
        insert(root,6);
        insert(root,8);

        int key = 6;

        if(search(root,key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
