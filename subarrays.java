public class subarrays{
    public static void sb(int array[]){
        int count=0;
        for(int i =0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                
                for(int k =i;k<=j;k++){
                    System.err.print(array[k]);
                    
                }count++;
                System.err.println(count );
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        sb(arr);
    }
}