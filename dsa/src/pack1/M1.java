class A{
	int data;
	A(int data){
		this.data = data;
	}
}
class M1{
	public static void main(String[] args){
		A a1 = new A(10);
		A a2 = new A(10);
		A a3 = new A(10);
		A a4 = new A(10);
		A a5 = new A(10);
		A a6 = new A(10);
		A a7 = new A(10);
		A a8 = new A(10);
		System.out.println(a1.data);
		System.out.println(a2.data);
		System.out.println(a3.data);
		System.out.println(a4.data);
		System.out.println(a5.data);
		System.out.println(a6.data);
		System.out.println(a7.data);
		System.out.println(a8.data);
		throw new IndexOutOfBoundsException();
	}
}