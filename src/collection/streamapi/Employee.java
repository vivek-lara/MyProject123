package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
    public	Integer eid;
    public String ename;
    public String edesignation;
    public Integer esal;
    public String ecity;
	public Employee(Integer eid, String ename, String edesignation, Integer esal, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesignation = edesignation;
		this.esal = esal;
		this.ecity = ecity;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"suresh","software developer",120000,"bengaluru");
		Employee e2 = new Employee(2,"ramesh"," hr",100000,"chennai");
		Employee e3 = new Employee(3,"ani","legal advisor",220000,"hyderabad");
		Employee e4 = new Employee(4,"mani","frontend developer",620000,"pune");
		Employee e5 = new Employee(5,"kumar","java developer",150000,"hyderabad");
		Employee e6 = new Employee(6,"john","full stack developer",990000,"lucknow");
		
		List<Employee> l = Arrays.asList(e1,e2,e3,e4,e5,e6);
		List<String> l1 = l.stream().filter(p->p.ecity.equals("hyderabad")).map(p->p.ename.toUpperCase())
				                       .collect(Collectors.toList());
		System.out.println(l1);
		
	}
}
