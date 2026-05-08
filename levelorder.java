import java.util.*;
public class levelorder{

    public static class Node{
        int data;
        Node left;
        Node right;
        
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;


    }public static class BinaryTree{
        static int idx= -1 ;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes) ;
            newnode.right=buildTree(nodes);
            return newnode;
        }
}
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;

                }else{
                    q.add(null);
                }
                
            }else{
                System.err.println(currNode.data);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }if(currNode.right!=null){
                    q.add(currNode.right);

            }
        }
    }
}
    }
}
//we use qeue 
//jab hum traversal karte hai usko hum dfs bolte hai
//jab hum level wise jate hai usko bolte hai bfs
//why we use qeue we need fifo now we will use iteration we wil
//put our root in qeue then childs in the qeue
//o(n)
//The <> is called diamond operator

// 🧠 What it means

// It represents type information (generics).matlb koi bhi string and int both in one