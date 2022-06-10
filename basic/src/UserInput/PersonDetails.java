package UserInput;

import java.util.Scanner;

public class PersonDetails {
	
	
	public static void main(String[] args) {
		
	

	Scanner s = new Scanner(System.in);
	
	System.out.println("enter your name");
	String name = s.next();
	
	System.out.println("enter your age");
	int age = s.nextInt();
	
	System.out.println("enter your gender");
	char gender = s.next().charAt(0);
	
	System.out.println("enter your phone number");
	long phno = s.nextLong();
	
	System.out.println("----------------------------");
	System.out.println("Name: "+ name);
	System.out.println("Age: "+ age);
	System.out.println("Gender: " +gender);
	System.out.println("Phone No: " +phno);
	
	
	
	
	}
}
