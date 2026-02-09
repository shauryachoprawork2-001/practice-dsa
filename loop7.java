public class loop7 {
    public static void main(String[] args) {
        for(int i =0;i<=4;i++){
            for(int j=1;j<=i;j++){
               System.err.print(j);
            }System.err.println("");
        }
    }
}
//print pattern of increasinhg numbers till it gets 4 like
/*
1
12
123
1234 */
//why does j work here because we are like making j inside the i loop so