package java8.pack1;
@FunctionalInterface //annotation not mandatory,any interface having single abstract method will be considered 
                       //as functional interface
interface A
{
	public void add(int c, int d);

}
public class M1_lambda {
      public static void main(String[] args) {
    	  
    	 A a1 = (c,d) -> System.out.println(c+d);
    	 a1.add(5, 7);
    	 
      }
}
