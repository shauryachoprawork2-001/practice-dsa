public class diaoftree2 {
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
    static class Info {
        int dia;
        int ht;
        Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diam(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diam(root.left);
        Info rightInfo = diam(root.right);
        int diam1 = leftInfo.dia;
        int diam2 = rightInfo.dia;
        int diam3 = leftInfo.ht + rightInfo.ht + 1;
        int finalDia = Math.max(diam3,
                        Math.max(diam1, diam2));
        int finalHt = Math.max(leftInfo.ht,
                       rightInfo.ht) +1;
        return new Info(finalDia, finalHt);
    }
        public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Info ans = diam(root);
        System.out.println("Diameter = " + ans.dia);
    }
}