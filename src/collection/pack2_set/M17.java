package pack2_set;

import java.util.HashSet;

class Lara_Students
{
	int id;
	String name;
	String address;
	Lara_Students(int id,String name,String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String toString()
	{
		return "("+id+","+name+","+address+")";
	}
	public int hashCode()
	{
		return Integer.toString(id).hashCode()+ name.hashCode()+address.hashCode();
	}
	public boolean equals(Object o)
	{
		return id == ((Lara_Students)o).id && name == ((Lara_Students)o).name && address == ((Lara_Students)o).address; 
	}
}
public class M17 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Lara_Students(1,"shivam","btm/anywhere"));
		set.add(new Lara_Students(8,"shivam","btm/anywhere"));
		set.add(new Lara_Students(2,"anil","btm/firstleft"));
		set.add(new Lara_Students(2,"anil","btm/firstleft"));
		set.add(new Lara_Students(3,"hiren","btm/groundfloor"));
		set.add(new Lara_Students(4,"jainendra","btm/kabhiyahakabhiwaha"));
		set.add(new Lara_Students(5,"shubhanshu","btm/infrontoflara"));
		set.add(new Lara_Students(5,"shivam","btm/anywhere"));
		set.add(new Lara_Students(5,"shivam","btm/anywhere"));
		System.out.println(set);
		
	}

}
