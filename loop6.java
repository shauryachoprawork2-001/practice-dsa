public class loop6 {
    public static void main(String[] args) {
        int ts=4;
        for(int i=0;i<=ts-1;i++){
            for(int j=1;j<ts-i;j++){
                System.err.print(" ");
            }for(int j=0;j<=i;j++){
                System.err.print("*");
            }System.err.println(" ");
        }
    }
}
//so like ismein bas spac wala hint yaad rkhna
/*
   * 
  ** 
 *** 
**** 
 */