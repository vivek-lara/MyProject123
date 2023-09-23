package pack3_map;

import java.util.TreeMap;

class F
{
	int i ,j ;
	F(int i,int j)
	{
		this .i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		
		return "("+i+","+j+")";
	}
	
}
public class M22_comparator_lambda_ifelse {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeMap map = new TreeMap((o1,o2)-> {
			if(((F)o1).i == ((F)o2).i) {
				if (((F)o1).hashCode() == ((F)o2).hashCode()) {
					if(((F)o1).equals(o2)){
						return 0;
						}
					else {
						return((F)o1).j - ((F)o2).j;
		            }
				}
				else return((F)o1).j - ((F)o2).j;
			}
			else return	((F)o1).i - ((F)o2).i;
		});
		map.put(new F(1,2), "m1");
		map.put(new F(1,3), "m1");
		map.put(new F(3,3), "m2");
		map.put(new F(2,2), "m3");
		map.put(new F(4,5), "m4");
		map.put(new F(3,5), "m6");
		map.put(new F(6,1), "m5");
		System.out.println(map);
		TreeMap map1 = new TreeMap((o1,o2)-> 
				{
					if(((F)o1).j == ((F)o2).j)
					{
						if(((F)o1).hashCode() == ((F)o2).hashCode())
						{
							if(((F)o1).equals(o2))
							{
								return 0;
							}
							else
							{
								return ((F)o1).i - ((F)o2).i;
							}
						}
						else 
						{
							return ((F)o1).i - ((F)o2).i;
						}
					}
					else
					{
						return ((F)o1).j - ((F)o2).j;
					}
					
				});
		map1.put(new F(1,2), "m1");
		map1.put(new F(2,3), "m2");
		map1.put(new F(3,2), "m3");
		map1.put(new F(4,5), "m4");
		map1.put(new F(6,1), "m5");
		map1.put(new F(7,1), "m6");
		map1.put(new F(5,1), "m7");
		map1.put(new F(6,1), "m8");
		System.out.println(map1);
	}

}
