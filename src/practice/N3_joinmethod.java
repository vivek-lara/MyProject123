package practice;
class Util1
{
	public static void sleep(long millis)
	{
		try {
			Thread.sleep (millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class FormSubmition extends Thread
{
	@Override
	public void run() {
		System.out.println("First Submit the form for IIT-JEE");
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Form submitted successfully");
		Util1.sleep(2000);
	}
}
class ConductExam extends Thread
{
	@Override
	public void run() {
		System.out.println("Entrance Exam Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Exam conducted successfully");
		Util1.sleep(2000);
	}
}
class ResultOut extends Thread
{
	@Override
	public void run() {
		System.out.println("Calculation started for the result");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Result is out on website");
		Util1.sleep(2000);
	}
}
public class N3_joinmethod {
   public static void main(String[] args) throws InterruptedException {
	   FormSubmition t1 = new FormSubmition();
	   t1.start();
	   t1.join();
	   
	   ConductExam t2 = new ConductExam();
	   t2.start();
	   t2.join();
	   
	   ResultOut t3 = new ResultOut();
	   t3.start();
}
}
