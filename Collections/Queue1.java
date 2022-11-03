package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Queue<Integer> queue=new LinkedList<>();
  queue.offer(100);
  queue.offer(120);
  queue.offer(140);
  queue.offer(160);
  queue.offer(180);
  queue.offer(200);
 
  System.out.println(queue);
  
  System.out.println(queue.peek());
  System.out.println(queue);
  
  System.out.println(queue.poll());
  System.out.println(queue);
  
  // we can also use add(),element(),remove() but this methods will throw exception if the element is performed specified task/operations.
  
	}

}
