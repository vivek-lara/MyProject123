package pack2;

public class M11 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
/*
*every thread is having a unique id
*t1 represents main thread
*by setName() method we can modify name of main thread but id of a thread can not be modified
*hence we may have two threads of same name
*1 is min priority ,10 is max priority, 5 is normal priority
*getPriority() method is used to measure priority and setPreority()method is
*used to modify priority b/w 1 to 10
*in any programming language threads are two types 
*1.Daemon thread
*2.User thread
*main thread is a user thread that is why isDaemon() method here is returning false
*we can convert user to Daemon and Daemon to user but  before start() method ,after start() method we can not
*change user thread to daemon thread and daemon to user thread
*/