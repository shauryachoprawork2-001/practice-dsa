public class factorial {
    public static int fact(int n){
        //base case
        if(n==1||n==0){
            return n;
        }else{
            int f = n;
            return  f *fact(n-1);
           
        }
    }

    public static void main(String[] args) {
        int n=4;
       System.err.println(fact(n));
    }
}

