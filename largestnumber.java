public class largestnumber {
    public static void largest(int marks[]){
        int hi=Integer.MIN_VALUE;
        for(int i=0;i<=marks.length-1;i++){
            if(marks[i]>hi){
                hi=marks[i];
                
            }
        }System.out.print(hi);
    }
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6,3,22,3,45};
        largest(marks);
        
    }
}
