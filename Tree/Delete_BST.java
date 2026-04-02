public class Delete_BST {

    static class Node {
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=right=null;
        }    
    }
    public static Node insert(Node root,int data){
        if(root==null)
            return new Node(data);
        if(data < root.data)
            root.left=insert(root.left,data);
        else if(data > root.data)
            root.right=insert(root.right,data);
        return root;
    }
    public static Node findMin(Node root){
        while(root.left != null)
            root = root.left;
        return root;
    }
    public static Node delete(Node root,int key){
        if(root == null)
            return null;
        if(key < root.data)
            root.left = delete(root.left,key);
        else if(key > root.data)
            root.right = delete(root.right,key);
        else{
            // Case 1:No child --> Delete directly

            if(root.left==null && root.right==null)
                return null;
            // Case 2:One child --> Replace with child

            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            // Case 3:Two child --> Replace with Inorder successor

            Node successor = findMin(root.right);        //get smallest in right
            root.data=successor.data;                    // Replace tha Value
            root.right=delete(root.right,successor.data);//Delete Duplicate
       }
            return root;
    }
    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
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

     System.out.println("Before Deletion:");
     inorder(root);

     root = delete(root,5);

     System.out.println();
     System.out.println("After Deletion:");
     inorder(root);

}
}
