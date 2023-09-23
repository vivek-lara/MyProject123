package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1_school {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("beans.xml");
		School s1 = c1.getBean("id", School.class);
		System.out.println(s1.getSchoolName());
		System.out.println(s1.getSchoolBoardName());
		System.out.println(s1.getNumberOfStudents());
		
		School s2 = c1.getBean("i", School.class);
		System.out.println(s2.getNumberOfTeachingStaff());
		System.out.println(s2.getSchoolName());
		System.out.println(s2.getSchoolBoardName());
		System.out.println(s2.getNumberOfStudents());
		
	
	}
}
