public class reverseanarray {
    public static void ra(int arr[]){
    int start=0;
    int end=arr.length-1;
    while (start<end){
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

    }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        ra(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}