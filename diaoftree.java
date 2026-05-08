public class diaoftree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root) {

        
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int dia(Node root){
        if(root==null){
            return 0;
        }
        int Leftdiam =dia(root.left);
        int lefth = height(root.left);
        int rightdiam = dia(root.left);
        int righth = height(root.right);

        int selfdiam = lefth+righth+1;
        return Math.max(selfdiam,Math.max(Leftdiam,rightdiam));
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
//basically the longest path between two ending paths
//0(n^2) so when we are going through each node we are also calculating the value of each node