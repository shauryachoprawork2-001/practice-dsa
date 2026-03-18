public class maxsubarray {
    public static void mxs(int arr[]){
        int ts=Integer.MIN_VALUE;
        int count=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int ti=0;
                count++;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    ti+=arr[k];
                }if(ti>ts){
                    ts=ti;
                }System.err.println(" ");
            }
        }System.err.println("the highest value of the subarrays:"+ts);
        System.err.println("the value of the subarrays:"
        +count);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        mxs(arr);
    }
}