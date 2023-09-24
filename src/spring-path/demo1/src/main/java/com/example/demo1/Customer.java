package com.example.demo1;

import java.util.List;
class Address{
	private String houseNo;
	private String streetName;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
}

public class Customer {
	private String firstName;
	private String lastName;
	private Integer age;
	private String[] emailIds;
	private List<Integer> marks;
	private Address address;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String[] getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

/*
 {
   "firstName":"abc",
   "lastName":"rty",
   "age":21,
   "emailIds":["a@d.com","e@t.com"],
   "marks":[3,5,6,7],
   "address":{
             "houseNo":"123/f",
             "streetName":"btm"
             }
   }
*/