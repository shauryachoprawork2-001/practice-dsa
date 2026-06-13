import java.util.*;
public class bstbalancedbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }}
        public static void inorder( ArrayList<Integer> inorderr,Node root){
            if(root==null){
                return;
            }
            inorder(inorderr,root.left);
            inorderr.add(root.data);
            inorder(inorderr,root.right);


        }
        public static Node createBst(ArrayList<Integer> inorderr ,int start ,int end){
            int mid= (start+end)/2;
            Node root= new Node (inorderr.get(mid));
            root.left = createBst(inorderr, start, mid-1);
            root.right=createBst(inorderr, mid+1, end);
            return root;
        }
        public static Node balancedBST(Node root){
            //inorder seq 
            ArrayList<Integer> inorderr = new ArrayList<>();
            inorder(inorderr, root);
            //sorted inorder-->balanced bst
            root = createBst(inorderr, 0, inorderr.size()-1);
            return root;

        }
    
    public static void main(String[] args) {
        Node root =new Node(8);
        root.left= new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right= new Node(6);
        root.right.right = new Node(5);
        root.right.right.right = new Node(3);
    }
}
