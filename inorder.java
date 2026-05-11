public class inorder {

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

    static class Binarytrees {
        static int idx = -1;
//taki outer class ka object na banana padhe
        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
        public static void inorder(Node root){
            if(root==null){
                return;

            }inorder(root.left);
            System.err.println(root.data+ " ");
            inorder(root.right);
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,-1};

        Binarytrees tree = new Binarytrees();
        Node root = tree.buildtree(nodes);

        System.out.println(root.data);
    }
}