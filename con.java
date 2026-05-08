public class con{
    static class Node{
        Node left;
        int  data;
        Node right;

    Node(int data){
        this.left=null;
        this.right =null;
        this.data= data;
    }
    public static int countnodes(Node root){
        if(root==null){
            return 0;
        }
        int lc = countnodes(root.left);
        int rc =countnodes(root.right);
        return lc + rc +1 ;
    }

}
public static void main(String[] args) {
    Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.right = new Node(4);
        root.left.left= new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

}
}

//   1
// /   \
// 2     3
// / \
// 4   5