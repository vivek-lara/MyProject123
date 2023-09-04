class F{
	int data;
	F ref;
	F(int data){
		this.data = data;
	}
	F(int data, F first){
		this.data = data;
		F last = first;
		while (last.ref != null){
			last = last.ref;
		}
		last.ref = this;
	}
}
class M5{
	public static void main(String[] args){
		F f1 = new F(10);
		F f2 = new F(20, f1);
		F f3 = new F(30, f2);
		F f4 = new F(40, f3);
		F f5 = new F(50, f4);
		F f6 = new F(60, f5);
		F current = f1;
		while (current != null){
			System.out.print(current.data + ", ");
			current = current.ref;
		}
	}
}
