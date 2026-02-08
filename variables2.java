public class variables2 {
    public static int add(int a,int b){
        a=10;
        b=14;
        return a+b ;
    }//a and b so their values could be changed they are known as variables

    public static void main(String[] args) {
        //variables are the objects whose values could be changed by us in java
       int a=20;
       int b=30;
       int c=add(a,b);
       System.err.println(c);

    
    }
}
