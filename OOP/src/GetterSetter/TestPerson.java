package GetterSetter;

import java.text.ParseException;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
		p.setName("kripanshu");
		p.setDob("14/06/1998");
		p.setAddress("khargone");
		
		System.out.println("person name : "+ p.getName());
		System.out.println("address : "+ p.getAddress());
		System.out.println("Person DOB --  "+p.getDate());
		
		
		
	}

}
