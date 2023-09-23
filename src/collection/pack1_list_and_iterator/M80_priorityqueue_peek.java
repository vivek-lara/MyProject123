package pack1_list_and_iterator;

import java.util.PriorityQueue;

public class M80_priorityqueue_peek {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();//PQ auto sorting but only for head element
		queue.add(90);                           //as in queue only head element is visible,
		queue.add(290);                        //no index no. is available in pq ,no get method available in pq
		queue.add(390);
		queue.add(900);
		queue.add(910);
		queue.add(890);
		queue.add(590);
		System.out.println(queue);
		System.out.println(queue.peek()); //peek method only reading head element
		System.out.println(queue);
		System.out.println(queue.peek());//in LL dual features available get() method as well as peek() method
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}

}
