public class PRIME {
    public static void  prime(int n){
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                System.err.println("is not primse");
                return;
            }

        }System.err.println("is prime");
        
    }
    public static void main(String[] args) {
        int n=6;
        prime(n);
        
    }
}
