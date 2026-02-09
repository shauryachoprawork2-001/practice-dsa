public class loop10 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.err.print("0");
                }else{
                    System.err.print("1");
                }
            }System.err.println(" ");
        }
    }
}
