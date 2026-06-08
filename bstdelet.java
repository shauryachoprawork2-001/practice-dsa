public class bstdelet {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Find Inorder Successor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete Node
    public static Node delete(Node root, int val) {

        if (root == null) {
            return null;
        }

        // Search
        if (val < root.data) {
            root.left = delete(root.left, val);
        }
        else if (val > root.data) {
            root.right = delete(root.right, val);
        }
        else {

            // Case 1: Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One Child

            // only right child
            if (root.left == null) {
                return root.right;
            }

            // only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two Children
            Node IS = findInorderSuccessor(root.right);

            root.data = IS.data;

            root.right = delete(root.right, IS.data);
        }

        return root;
    }
    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }
    
        if (root.data >= k1 && root.data <= k2) {
    
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
    
        }
        else if (root.data < k1) {
    
            printInRange(root.right, k1, k2);
    
        }
        else {
    
            printInRange(root.left, k1, k2);
    
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int values[] = {1, 3, 2, 4, 5, 6};

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        
        inorder(root);

        root = delete(root, 3);

      
        inorder(root);
    }
}
//3 cases
//no child leaf node==> delete karne ke pehle search ka likhenge then we will return null to parent 
//one child single child mai replace kardo with child ke sath
//two child  find inorder succesor then delete the node for inorder succesor
//inorder succesor is the leftmost node