public class rec3{
    public static int fibanacci(int n){
       
            if(n==0){
                return 0;
            }else if(n==1){
                return 1;
            }else{
                return fibanacci(n-1)+fibanacci(n-2);
            }

            
        
    }
    public static void main(String[] args) {
        int n=9;
        System.err.println(fibanacci(n));
    }
}