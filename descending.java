public class descending {
    public static void des(int n){
        //base case
        if(n==1){
            System.out.println(n);
           
        }else{
            System.out.println(n);
            des(n-1);
           
        }
    }

    public static void main(String[] args) {
        int n=9;
        des(n);
    }
}

//to get descending order