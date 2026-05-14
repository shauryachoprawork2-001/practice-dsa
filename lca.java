public class lca {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        public static void lcaa(Node root){


        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
    }
}
//root se node tak humnein ek array mai dala suppose
//like 1,2,4  agar aur 1,3,6  