public class lastoccurence{
    public static int lasto(int n[], int key, int i) {
        
       
        if(i == n.length){
            return -1;
        }

        
        int found = lasto(n, key, i + 1);

      
        if(found != -1){
            return found;
        }

        
        if(n[i] == key){
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n[] = {2,3,4,5,2,3,4,5};
        System.out.println(lasto(n, 2, 0));
    }
} 