public class firstoccurrence {
    public static int firocc(int n[],int key,int i){
        
         if(i==n.length){
            return -1;
        }if(n[i]==key){
            return i;
            
            
        } return firocc(n, key, i+1); } 

    public static void main(String[] args) {
      
        int n[]={3,4,6,9};
        System.err.println(firocc(n, 9, 0));

    }
}