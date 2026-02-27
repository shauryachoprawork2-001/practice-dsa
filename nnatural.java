public class nnatural {
    public static void nnatural(int n){
        if(n==1){
            System.out.println(n);
        }else{
            nnatural(n-1);
            System.err.println(n);
        }
    }
    public static void main(String[] args) {
        int n=9;
        nnatural(n);
    }
}