public class subarrays {
    public static void psb(int array[]){
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int second=j;
                for(int k=start;k<=second;k++){
                    System.out.print(array[k]);
            }System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        psb(array);
        
    }
}
