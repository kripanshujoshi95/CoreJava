package MethodCallingFromMyClassToMainClass;

public class MethodCalling {
	public static void main(String[] args) {
		TestCalling n = new TestCalling();
		n.add();
		
		TestCalling s = new TestCalling();
		s.sub();
		
		TestCalling k = new TestCalling();
		k.mul();
		
		TestCalling.divison();
		
		TestCalling.addition();
	    
		TestCalling.sum();
	}
	
	
	
	
	

}
