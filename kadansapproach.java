public class kadansapproach{
    public static void kd(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
            }System.err.println(maxsum);
        }
            public static void main(String[] args) {
                int arr[]={1,3,3,-2,1};
                kd(arr);
            }
        }
    