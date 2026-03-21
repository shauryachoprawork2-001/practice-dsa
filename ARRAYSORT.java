public class ARRAYSORT {
    public static boolean arrsor(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }else{
            if(arr[i]>arr[i+1]){
                return false ;
            }
        }return arrsor(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,4};
        System.err.println((arrsor(arr, 0)));
    }
}