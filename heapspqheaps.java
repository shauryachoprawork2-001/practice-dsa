import java.util.PriorityQueue;

public class heapspqheaps {
    static class Student implements Comparable<Student> { //overridding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank -s2.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("a",10));
        pq.add(new Student("b",11));
        pq.add(new Student("c",20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" ");
            pq.remove();
        }
    }
}


// now how do we rank our objects

