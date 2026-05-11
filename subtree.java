public class subtree {
    static class Node{
        int data;
        Node left;
        Node right;
     Node(int data){
        this.data= data;
        this.left= null;
        this.right=null;
     }
     
     }
     public static boolean isIdentical(Node root ,Node subroot){
        if(root==null && subroot==null){
            return true;
        }else if(root == null||subroot ==null||root.data!=subroot.data){
            return false;
        }
        boolean leftIdentical = isIdentical(root.left, subroot.left);
        boolean rightIdentical = isIdentical(root.right, subroot.right);

        return leftIdentical && rightIdentical;
    }

     

     public static boolean issubtree(Node root,Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){

            if(isIdentical(root,subroot)){
                return true;
            }
        }
        
        boolean left = issubtree(root.left, subroot);
        boolean right = issubtree(root.right, subroot);
        
        return left || right;

     }
    public static void main(String[] args) {
        Node root = new Node(1);

root.left = new Node(2);
root.right = new Node(3);

root.left.left = new Node(4);
root.left.right = new Node(5);

root.right.left = new Node(6);
root.right.right = new Node(7);
Node subRoot = new Node(2);

subRoot.left = new Node(4);
subRoot.right = new Node(5);
    }
}
//1 find subroot in tree
// check identical
//non idenctical node.data equal nhi node null hai subroot nhi lefrt subtree ya right subtree non identical nhi
///do kaam find subroot in tree ,check identical 
//1 find subroot in tree
// check identical
//non idenctical node.data equal nhi node null hai subroot nhi lefrt subtree ya right subtree non identical nhi
///do kaam find subroot in tree ,check identical 