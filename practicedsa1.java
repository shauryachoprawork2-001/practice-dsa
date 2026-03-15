public class practicedsa1{
    public static void largest(int arr[]){
        int larg= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>larg){
               larg=arr[i];

            }
            
        }System.out.println(larg+" this is the final part ");

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        largest(arr);
    }
}