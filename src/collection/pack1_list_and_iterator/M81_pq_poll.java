package pack1_list_and_iterator;

import java.util.PriorityQueue;

public class M81_pq_poll {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);                           
		queue.add(290);                       
		queue.add(390);
		queue.add(900);
		queue.add(910);
		queue.add(890);
		queue.add(590);
		queue.add(90);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
