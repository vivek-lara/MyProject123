package pack1_list_and_iterator;
interface K1
{
	int sum(int i, int j);
}
public class M63_lambda_sum {
     public static void main(String[] args) {
		K1 k1 = (x,y) -> x+y;
		System.out.println(k1.sum(10, 20));
	}
}
