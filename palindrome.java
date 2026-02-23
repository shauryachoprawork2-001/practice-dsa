public class palindrome{
    public static void main(String[] args) {
       int n=191;
       int revesre=0;
       while(n!=0){
        int last = n%10;
        n=n/10;
        revesre = last + n*10;
        if(revesre==n){
            System.err.println("same hai");
        }
       }

       System.err.println(n);
    }
}
