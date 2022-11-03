package Collections;

//import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue<Integer> pq=new PriorityQueue<>();
  pq.offer(100);
  pq.offer(20);
  pq.offer(140);
  pq.offer(60);
  pq.offer(180);
  pq.offer(10);
  System.out.println(pq);
  System.out.println(pq.peek());
  System.out.println(pq.poll());
  System.out.println(pq);
	}

}
