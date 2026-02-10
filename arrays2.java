public class arrays2 {
    public static void count(int marks[]){
        for(int i =0;i<=marks.length-1;i++){
            marks[i]=marks[i]+1;
        } 

          
        }public static void main(String[] args) {
            int marks[]={99,98,94};
            count(marks);
            for(int i=0;i<=marks.length-1;i++){
                
                System.err.println( marks[i]);
            }
          
        }
    
    
    }

    