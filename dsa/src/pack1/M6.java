class G{
	int data;
	G ref;
	G last;
	G(int data){
		this.data = data;
		last = this;
	}
	G(int data, G first){
		this.data = data;
		first.last.ref = this;
		first.last = this;
		
	}
}
class M6{
	public static void main(String[] args){
		G g1 = new G(10);
		G g2 = new G(20, g1);
		G g3 = new G(30, g1);
		G g4 = new G(40, g1);
		G g5 = new G(50, g1);
		G g6 = new G(60, g1);
		
		G current = g1;
		while(current !=null){
			System.out.println(current.data + ", ");
			current = current.ref;
		}
		System.out.println(g1.last.data);
	}
}
