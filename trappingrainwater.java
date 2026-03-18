public class trappingrainwater {
    public static void trp(int arr[]){
        int n=arr.length;
       //left max
        int left[]=new int[n];
        left[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
       //right max
       int right[]=new int[n];
       right[n-1]=arr[n-1];
       for(int k=n-2;k>=0;k--){
        right[k]=Math.max(right[k+1],arr[k]);
       }
       //min water level
       int trappedwater=0;
       for(int j=0;j<n;j++){
        int waterlevel=Math.min(left[j],right[j]);
        trappedwater+=waterlevel-arr[j];
       }System.err.println(trappedwater);
    }

    

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        trp(arr);
    }
}