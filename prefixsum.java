public class prefixsum{
    public static void pfs(int array[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[array.length];
        prefix[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i]=prefix[i-1]+array[i];
      }for (int i = 0; i < array.length; i++) {
        int start=i;
        
        for(int j=i;j<array.length;j++){
            int end=j;
            
          if (start==0){
             currsum=prefix[end];
          }else{
            currsum=prefix[end]-prefix[start-1];
          }if(currsum>maxsum){
            maxsum=currsum;
          }
        }
      }System.err.println(maxsum);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        pfs(array);
    }
}