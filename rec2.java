public class rec2 {
    public static int factoriall(int n){
        //base case
        if(n==1||n==0){
            System.err.println(n);
            return 1;
        }else{
           int a= n* factoriall(n-1);
           return a;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.err.println(factoriall(n));
    }
}