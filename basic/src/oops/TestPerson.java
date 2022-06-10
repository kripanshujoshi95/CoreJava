package oops;

import java.text.ParseException;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
		p.setName("satyam");
		p.setAddress("indore");
		p.setDob("31/06/2022");
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		
		
		
	}

}
