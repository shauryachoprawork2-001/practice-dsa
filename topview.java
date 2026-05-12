import java.util.*;
public class topview{
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
    static class Info{
        Node node;
        int hd;
    Info(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
    public static void topview(Node root){
        Queue<Info> q = new LinkedList<>();
        //storing the distnce
        HashMap<Integer,Node> map = new HashMap<>();
        int min =0;
        int max=0;
        q.add(new Info(root,0));
        q.add(null);
        //q.add(null); is being used as a level marker (separator) in the queue for level-order traversal (BFS).
        

        while(!q.isEmpty()){
            Info curr =q.remove();
            if(curr==null){
                System.err.println(" ");
                 if(q.isEmpty()){
                    break;
                 }else{
                    q.add(null);
                 
                 }
            }
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            
            if(curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }



}

//  1
// 2 3
//4 5 4 6 top view=4,2,1,3,6

//   1
// 2.   3
//.  4
//.     5
//       6 top view 2,1,3,6


//map stores two value one value key and one value
//table type ka data hota hai
//add remove get karne ki time complexity costant hoti hai because hashtable use karte hai
//basically hashing se hum password ki form change kardete hai 
//adding data we put data map.put(key,value)
// map.get(key) key ke adjacent jo bhi woh hai
//create hashmap<string//should be unique always,integer> map = new hashmap<>();

//horizontal distance in trees sabse upar wali node ka horizontal distance lete hai hum zero
//toh tree mai like horizontal distance aata hai woh aata hai hamara like 
//root ko origin lene se jese first tree ke 1 pe 0,0 uske left side yani 2 negative and right positive