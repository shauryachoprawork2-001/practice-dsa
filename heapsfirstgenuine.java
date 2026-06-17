
import java.util.ArrayList;

public class heapsfirstgenuine {
    static class Heap{
        ArrayList<Integer> arr =new ArrayList<>();
    public void add(int data){
        arr.add(data);
        int x =arr.size()-1;
        int par =(x-1)/2;
        while(arr.get(x)<arr.get(par)){
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);


        }
    }
}
}
 //time complexity 
 //while loop ==> jitne levels hai utna travel ho sakta hai worst case 0(logn)