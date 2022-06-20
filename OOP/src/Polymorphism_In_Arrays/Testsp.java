package Polymorphism_In_Arrays;

public class Testsp {
	public static void main(String[] args) {
		
		
		
		SHAPE [] s = new SHAPE[3];
		s[0]=new CIRCLE(12);
		s[1]=new RECTANGLE(10, 20);
		s[2]= new TRIANGLE(10, 29);
		
		for (int i = 0; i < s.length; i++) {
		System.out.println(s[i].area());	
		}
		
		
		
		//one by one area bhi nikal skte h ==>
		
		//System.out.println(s[0].area());
		//System.out.println(s[1].area());
		//System.out.println(s[2].area());
		
		
		
		
		
		
		
		
		
	}

}
