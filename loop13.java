public class loop13 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.err.print(" ");
            }for(int j=1;j<=2*i-1;j++){
            System.err.print("z");}System.err.println("");
        }for(int i =4;i>=1;i--){
            for(int j=1;j<=4-i;j++){
                System.err.print(" ");
            }for(int j=1;j<=2*i-1;j++){
                System.err.print("z");}
            System.err.println("");
        }
    }
}
