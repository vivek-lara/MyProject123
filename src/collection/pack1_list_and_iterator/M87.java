package pack1_list_and_iterator;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class C1 
{
	int i,j;
	C1(int i, int j)
	{
	  this.i = i;
	  this.j = j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
	
}
public class M87 {
       @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue((o1,o2)-> 0 - (((C1)o1).i-((C1)o2).i));
		queue.add(new C1(100,20));
		queue.add(new C1(100,20));
		queue.add(new C1(101,20));
		queue.add(new C1(102,200));
		queue.add(new C1(1000,210));
		queue.add(new C1(140,220));
		queue.add(new C1(250,250));
		queue.add(new C1(100,20));
		queue.add(new C1(100,20));
		queue.add(new C1(20,100));
		queue.add(new C1(20,100));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
