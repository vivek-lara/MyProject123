package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person11 {
	public String pname;
	public String pcity;
	public int page;
	Person11(String pname,String pcity,int page)
	{
		this.page = page;
		this.pcity = pcity;
		this.pname = pname;
	}
   public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(new Person11("p1","c1",20));
	al.add(new Person11("p2","c2",2));
	al.add(new Person11("p3","c3",10));
	al.add(new Person11("p4","c5",22));
	al.add(new Person11("B5","c4",24));
	//al.stream().filter(p->p.pname.startsWith("B"));
	
}
}
