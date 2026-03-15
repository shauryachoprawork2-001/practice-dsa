
public class practicedsa1{
    public static void binarySearch(int arr[],int key){
       
        int start =0;
        int end=arr.length-1;
       
  
        while(start<=end){
            int mid=start +((end-start)/2);
            if(arr[mid]>key ){
                end=mid-1;
            }else if (arr[mid]<key){
                start=mid+1;

            }else if (arr[mid]==key){
                System.err.println(mid
                );
                return;
            }else{
                System.err.println("not found");
                return;
            }
        } System.err.println("not found");
       
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        binarySearch(arr,6);
       
    }
}
//binary seearch
//reverse an arrya
//pairs in an array
//subarrays
//max sum 2
//trapping rain water
