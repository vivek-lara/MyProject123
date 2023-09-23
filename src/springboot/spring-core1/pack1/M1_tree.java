package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1_tree {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new 
				ClassPathXmlApplicationContext("tree.xml");
		Tree tr = Context.getBean("t1",Tree.class);
		System.out.println(tr.getTypeOfTrees());
		System.out.println(tr.getPartsOfTree());
	}

}
