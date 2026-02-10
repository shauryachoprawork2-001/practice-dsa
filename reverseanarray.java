public class reverseanarray {
    public static void ra(int array[]){
        int first =0;
        int last=array.length-1;
        while(last>=first){
            int temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
 
        }
    
    public static void main(String[] args) {
        int array[]={ 12,23,22
        };
        ra(array);
        for(int i =0;i<=array.length-1;i++){
            System.err.println(array[i]);
          
        }
        
    }
}
