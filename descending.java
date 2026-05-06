public class descending {
    public static void des(int m){
        //base case
        if(m==1){
            System.out.println(m);
           
        }else{
            System.out.println(m);
            des(m-1);
           //this is very important
        }
    }

    public static void main(String[] args) {
        int n=9;
        des(n);
    }
}

//to get descending order