public class prefixsum {
    public static void prefixs(int arr[]){
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
       
            prefix[0]=arr[0];
        
        for(int i =1;i<arr.length;i++){
            
            prefix[i]=arr[i]+prefix[i-1];

        }for(int st=0;st<arr.length;st++){
            for(int end=st;end<arr.length;end++){
                int currsum;
                if(st==0){
                    currsum=prefix[end];
                }else{
                    currsum=prefix[end]-prefix[st-1];
                }if(currsum>max){
                    max=currsum;
                }
            }

        }System.err.print(max);
           
        } 
       
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        prefixs(arr);

    }
}