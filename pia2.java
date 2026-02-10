public class pia2 {
    public static void pairs(int arrays[]){
        for(int i =0;i< arrays.length;i++){
            int curr=arrays[i];
            for(int j=i+1;j<arrays.length;j++){
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

    
