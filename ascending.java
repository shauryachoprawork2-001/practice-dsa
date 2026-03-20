public class ascending {
    public static void des(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }else{
           
            des(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n=9;
        des(n);
    }
}