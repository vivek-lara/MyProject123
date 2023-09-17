package practice;

import java.util.Iterator;

public class N4_thread_state {
   public static void main(String[] args) {
	Thread.State[] state = Thread.State.values();
	for(Thread.State states:state)
	{
		System.out.println(states);
	}
}
}
