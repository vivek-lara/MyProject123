/**
 * start()method should not execute more than one time for the same thread,otherwise in which ever thread 
 * execution start method is executing second time that thread will be terminated.
 * 
 * we can interrupt any thread from sleeping interrupt() method while sleep method is applied 
 * 
 * if there is sleep() method it is a checked type of exception statement,we should handle it by providing
 * interrupted exception in catch body
 * 
 * we can put start() method in constructor body of subclass of Thread class, through this we can auto start
 * a thread by creating object in main method
 * 
 * Thread.currentThread.getName()=> to get the name of thread
 * Thread.currentThread.setName()=> to change the name of thread
 * both above methods if class is extending Thread class
 * 
 * Daemon thread executes till the parent thread is under execution, when parent thread get out of execution 
 * Daemon thread also comes out of execution even its task is remaining
 * 
 * User thread is independent from the execution of parent thread, it executes the given task first then only
 * comes out of execution
 * 
 * By default every User thread is false for thread.isDaemon() method
 * we can set a thread as daemon thread before execution of start() method,after execution of start() method
 * its not possible
 * 
 * Allowing only one thread to access an object at a time is called as synchronization
 * 
 * synchronization is object wise
 * 
 * every object is having one object lock, whichever thread will get the object lock first, will access the 
 * object first
 * 
 * we can synchronize a method by declaring method as "synchronized"
 * 
 * if there are two methods in a class one is declared synchronized and other one is non-synchronized,
 * then we can access both the methods by two different threads simultaneously as non-synchronized method
 * does not require object lock
 * 
 * instead of declaring whole method as synchronized, we can synchronize a particular portion of a method
 * by applying a synchronized block ,that synchronized block required a mutex i.e. argument of synchronized
 * block
 * 
 * in case of static methods we need class lock instead of object lock
 * 
 * sleep() is a method which is used to pause the process for few seconds or the time we want to. But in case 
 * of wait() method, thread goes in waiting state and it won’t come back automatically until we call
 * the notify() or notifyAll().
 * 
 * wait(),notify(),notifyAll() all these three methods are non-synchronized,any thread can call all these 
 * three methods,all these three methods are applicable on same object.
 * 
 * one thread will put on wait by calling the wait() method using object reference and that thread will be
 * resumed only when another (different)thread will call notify()or notifyAll()method using same object
 * reference not the other object
 * 
 * even though all these three methods by default are non-synchronized ,we must call wait() method of an
 * object by having object lock in the synchronized method body or in synchronized block and after calling wait()
 * method, to resume that thread we will call notify() or notifyAll() method from different thread of the 
 * same object only after having object lock.
 * 
 *every thread is having a unique id
 *
 *t1 represents main thread
 *
 *by setName() method we can modify name of thread but id of a thread can not be modified
 *hence we may have two threads of same name
 *
 *1 is minimum priority ,10 is max priority, 5 is normal priority
 *by default main thread is having priority value 5, we can change the priority by setPriority() method
 *if we don't set the priority of a child thread then automatically it will get the inherited priority of 
 *parent thread
 *getPriority() method is used to measure priority and setPreority()method is used to modify priority 
 *b/w 1 to 10
 *
 *in any programming language threads are two types 
 *1.Daemon thread
 *2.User thread
 *
 *main thread is a user thread that is why isDaemon() method here is returning false
 *we can convert user to Daemon and Daemon to user but  before start() method
 *we can change the daemon status before starting the thread
 *
 *child thread priority depends on parent thread priority(priority of parent inheriting 
 *to child
 * 
 * join() method allows another thread to join the current thread only after the complete execution of 
 * current thread
 * 
 * yield() method allows other threads having same priority to execute first by pausing current thread
 * 
 * there are six states of a thread 1.new 2. runnable 3. blocked 4.waiting 5. timed_waiting 6.terminated
 * 
 * by default thread any has three states new,runnable and terminated
 * 
 * timed_waiting state of a thread we can achieve by calling sleep() method
 * 
 * for waiting state of a thread we should call wait() or join() method 
 * 
 * for blocked state of a thread we have to create deadlock condition of threads
 * 
 * for frequent switching of threads we call yield() method
 * 
 * thread calling yield() method suggests thread scheduler to give chance other threads also
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

