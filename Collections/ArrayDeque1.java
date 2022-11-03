package Collections;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayDeque<Integer> adq=new ArrayDeque<>();
  adq.offer(50);
  adq.offerFirst(20);
  adq.offerLast(5);
  adq.offer(30);
  adq.offerLast(20);
  
  System.out.println(adq);
  
  System.out.println(adq.peek());
  System.out.println(adq.peekFirst());
  System.out.println(adq.peekLast());
  System.out.println(adq);
  
  System.out.println(adq.poll());
  System.out.println(adq.pollFirst());
  System.out.println(adq.pollLast());
  
  System.out.println(adq);
	}

}
