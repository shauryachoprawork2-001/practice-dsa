//get ith bit 
import java.util.*;
public class bitoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int bitmask=1;
        int ith=sc.nextInt();
        if((((a>>ith)& bitmask))==1){
            System.err.println("1");
        }else{
            System.err.println("0");
        }
    }
}
//get 
//set
//clear
//update
//clear ith bits
//clear range of bits
