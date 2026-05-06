public class containerwithmostwater {
    public static int containingmostwater(int arr[]){
        int lp=0;
        int rp =arr.length;
        int maxwater=Integer.MIN_VALUE;
        while(lp>rp){
            if(arr[lp]>arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
//[1,8,6,2,5,4,8,3,7]