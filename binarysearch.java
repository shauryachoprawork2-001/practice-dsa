public class binarysearch {
    public static void bs(int marks[],int key){
        
        int first=0;
        int last =marks.length-1;
        while(first<=last){
            int mid=(last+first)/2;
            if(marks[mid]==key){
                System.err.println(mid);
                return;
            }else if(key>marks[mid]){
                first=mid+1;
                
            }else {
                last=mid-1;
               
             }  
        }System.out.println("not found");
    
         
            }public static void main(String[] args) {
                int marks[]={1,2,3,4,5,6};
                int key =4;
                bs(marks, key);
            }
        }
        