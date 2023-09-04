class C{
	int data;
	C ref;
	C(int data){
		this.data = data;
	}
}
class M2{
	public static void main(String[] args){
		C c1 = new C(50);
		C c2 = new C(60);
		C c3 = new C(70);
		C c4 = new C(80);
		c1.ref = c2;
		c2.ref = c3;
		c3.ref = c4;
		System.out.println(c1.data);
		System.out.println(c1.ref.data);
		System.out.println(c1.ref.ref.data);
		System.out.println(c1.ref.ref.ref.data);
//		System.out.println(c1.ref.ref.ref.ref.data);
		
	}
}