import java.util.*;
public class heapspqreverse {
    


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(5);
        while(!pq.isEmpty()){
            System.err.println(pq.peek());
            pq.remove();
        }
    }
}
//it is a min heap isliye ye list ki tarah store nhi hote


//jav ye sort honge toh inke beech mai comaprisons hong eisliye comparator use hote hai

