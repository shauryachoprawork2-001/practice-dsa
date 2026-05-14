import java.util.*;

public class kthlevel {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void kthLevel(Node root, int k) {

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        int level = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            // current level processing
            if (level == k) {

                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    System.out.print(curr.data + " ");
                }

                return;
            }

            // normal BFS expansion
            for (int i = 0; i < size; i++) {

                Node curr = q.remove();

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            level++;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthLevel(root, 3);
    }
}