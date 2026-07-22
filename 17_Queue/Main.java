
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main { 

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        // Most Value => high Priority => Max Heap Behaviour
        Queue<Integer> pq = new PriorityQueue<>();

        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // q.offer(40);
        // System.out.println(q);

        // System.out.println(q.peek());

        // System.out.println(q.poll());

        // System.out.println(q);



        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);

    }

}
