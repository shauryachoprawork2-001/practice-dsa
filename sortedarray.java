public class sortedarray {
    public static int sort(int x,int n){
        if(n==0){
            return 1;
        }else{
            
            int xn = x * sort(x, n-1);
            return xn;
        }
    }

    public static void main(String[] args) {

        int n=3;
        int x=2;
        System.err.println(sort(x,n));
    }
}