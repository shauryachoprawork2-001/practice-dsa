
import java.util.ArrayList;

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
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundright=getPath(root.right,n,path);
        if(foundLeft|| foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
        public static void lcaa(Node root,int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);
            int i;
            for(i=0; i<path1.size() && path2.size() ;i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lca =path1.get(i-1);



        }
        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist =lcaDist(root.left,n);
            int rightDist =lcaDist(root.right,n);
            if(leftDist ==-1 && rightDist==-1){
                return -1;
            }else if(leftDist==-1){
                return rightDist+1;
            }else{
                return leftDist+1;
            }
        }

        public static int mindist(Node root,int n1,int n2){
            Node lca=lca2(root, n1, n2);
            int dist1 =lcaDist(lca,n1);
            int dist2 =lcaDist(lca,n2);
            return dist1+dist2;

        }
        public static Node lca2(Node root,int n1,int n2){
            if(root==null){
                return null;
            }
            if(root.data==n1||root.data==n2){
                return root;
            }
            Node leftLca =lca2(root.left,n1,n2);
            Node rightLca =lca2(root.right,n1,n2);
            if(rightLca==null){
                return leftLca;
            }
            if(leftLca==null){
                return rightLca;gi
        }
        return root;
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