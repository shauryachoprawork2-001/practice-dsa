public class fibo{
    public static int  fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibm =  n-1;
        int fibn = n-2;
        int fibtotal =fibn +fibm;
        return fibtotal;
    }
    public static void main(String[] args) {
        int n=3;
       System.err.println(fib(n)); 
    }
}