public class heaightoftree{
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
    public static int height(Node root){
        if(root==null){
            return 0;

        }
        int rh=height(root.right);
        int lh=height(root.left);
        int treeh = Math.max(rh,lh)+1;
        return treeh;
    }
    public static void main(String[] args) {
        

        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.right = new Node(4);
        root.left.left= new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int rh= height(root);
        System.out.println(rh);
    }

}
//height of tree =level/edges ke term mai ek kam aati hai 
//basically trees ka sara recursion se hota hai
//basically jismein like child node apna nikal ke deta hai
//lh =height(root left)
//rh =height(root right)
//max(rh,lh)+1 to cover root
// 1
//       /   \
//      2     3
//     / \   / \
//    5   4 6   7