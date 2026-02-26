import java.util.*;
public class bitwisenew {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int bitmask=1;
        if((n&bitmask)==0){
            System.err.println("is even");

        }else{
            System.out.println("is odd");
        }System.out.print(5&1);
    }
}