public class lastoccurence {
    public static int lasto(int n[],int key,int i){
        if(i==0&&n[i]!=key){
            return -1;
        }if(n[i]==key){
            return i;
        }return lasto(n, key, i-1);
    }
    public static void main(String[] args) {
        int n[]={2,3,4,5,2,3,4,5};
        int m=n.length-1;
        System.err.println(lasto(n, 2, m));
    }
}