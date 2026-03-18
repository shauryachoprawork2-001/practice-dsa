public class Pairsinanarray {
    public static void pia(int arr[]){
        int count =0;
        for(int i =0;i<arr.length-1;i++){
            System.err.println(arr[i]+" "+arr[i+1]);
            count ++;
            

        }System.err.println("total number of pairs are:"+count );
    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        pia(arr);
        
    }
}