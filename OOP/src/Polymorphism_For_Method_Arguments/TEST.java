package Polymorphism_For_Method_Arguments;



public class TEST {
	public static void main(String[] args) {
		
		SHAPE1[] s = new SHAPE1[3] ;
		s[0]= new RECTANGLE1(10, 10);
		s[1]= new CIRCLE1(10);
		s[2]= new TRIANGLE1(5, 5);
		                                            
        double totalarea = 0;
        for (int i = 0; i < s.length; i++) {
			totalarea += s[i].area();
		}

	System.out.println(totalarea);        // rectangle area  =    100
	                                      //cirle area       =    314
	                                      //triangle area    =    12.5
	                                      //-----------------------------
                                          //Total area       =	  426.5   
	
	}                                      //isme sabka area add hoke print hoga
	
		
	}


