public class factorial2 {
    public static int fact(int n){
        if(n==0||n==1){
            return n;
        } else{
            int fn= n * fact(n-1
            );
            return fn;
        }
    }
    public static void main(String[] args) {
        int n=9;
       System.err.println(fact(n));
    }
}
