public class recursion {
    public static void increasingorder(int n){
    //base case 
    if(n==1){
        System.err.println(n);
       return;
    }else{
        increasingorder(n-1);
        System.err.println(n);
        
    }
    }
    public static void main(String[] args) {
        int n=9;
        increasingorder(n);
    }
}