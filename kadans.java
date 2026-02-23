public class kadans {
    public static void kd(int arr[]){
    int currsum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){

        currsum+=arr[i];
        max=Math.max(currsum, max);
        if(currsum<0){
            currsum=0;
        }
           
        

    }System.err.print(max);
}

    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,8};
        kd(arr);
    }
}