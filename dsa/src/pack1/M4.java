class E{
	int data;
	E ref;
	E(int data){
		this.data = data;
	}
	E(int data, E prev){
		this.data = data;
		prev.ref = this;
	}
}
class M4{
	public static void main(String[] args){
		E e1 = new E(10);
		E e2 = new E(20,e1);
		E e3 = new E(30,e2);
		E e4 = new E(40,e3);
		E e5 = new E(50,e4);
		E obj = e1;
		while(obj != null){
			System.out.println(obj.data);
			obj = obj.ref;
		}
	}
}
