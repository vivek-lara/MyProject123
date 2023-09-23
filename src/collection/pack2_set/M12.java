package pack2_set;

public class M12 {
	public static void main(String[] args) {
		String s1 ="testhello1234nsdjksdjskjdksj,kskksjdsjdij,snjsjhd";
		String s2 ="testhello1234nsdjksdjskjdksj,kskksjdsjdij,snjsjhd";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println("----------");
		D a1 = new D(90);
		D a2 = new D(90);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
	}

}
/*
 * In String class hashcode and equals method not present ,in string class it overrides content of string in form of hash no.(integer
 *no) 
 * and when we create our own object if we dont override hashcode method in it,it allocates the memory address of new object.
 */
