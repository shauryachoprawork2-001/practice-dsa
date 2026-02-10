public class pia {
    public static void pairs(int arrays[]){
        for(int i =0;i<= arrays.length-1;i++){
            int curr=arrays[i];
            for(int j=0;j<arrays.length-1;j++){
                int cc=arrays[j];
                System.err.println(curr+ ","+
                cc);
            }
        }
    }
    public static void main(String[] args) {
        int arrays[]={1,2,3,4};
        pairs(arrays);
        
    }
}
