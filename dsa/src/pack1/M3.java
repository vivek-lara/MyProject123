class D{
	int data;
	D ref;
	D (int data){
		this.data = data;
	}
}
class M3{
	public static void main(String[] args){
		D d1 = new D(50);
		D d2 = new D(60);
		D d3 = new D(70);
		D d4 = new D(80);
		d1.ref = d2;
		d2.ref = d3;
		d3.ref = d4;
		D temp = d1;
		while (temp != null){
			System.out.println(temp.data);
			temp = temp.ref;
		}
	}
}