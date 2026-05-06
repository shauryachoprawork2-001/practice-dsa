

public class BINARYTREES2 {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        }
        static class binarytrees{
            static int idx=-1;
            public static Node binarytreees(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null;}
                Node newnode = new  Node(nodes[idx]);
                newnode.left = binarytreees(nodes);
                newnode.right = binarytreees(nodes);
                return newnode ;
            }
        }
        public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = binarytrees.binarytreees(nodes);
        System.out.print(root.data);
    }
}
