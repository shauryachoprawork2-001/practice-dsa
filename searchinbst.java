public class searchinbst {
    
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root =new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
        public static boolean search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search(root.left,key);
            }
            if(root.data<key){
                return search(root.right,key);
            }
            else{
                return false;
            }
        }
    
    public static void main(String[] args) {
        int values[]={5,3,6,3,2,1};
        Node root =null;
        for(int i =0;i<values.length;i++){
           root = insert(root,values[i]);
        }
        if(search(root,1)){
            System.err.println("true");
        }else{
            System.err.println("not");
        }
         
    }
}
