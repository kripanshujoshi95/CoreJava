package Exercise4_14_First;

public class Exercise6_FIBONACCI {
	public static void main(String[] args) {
	
	//	0 1 1 2 3 5 
	//	0+1=1
	//	  1+1=2 
	//	    1+2=3    
	// 	      2+3=5
		
		
		int a = 0; 
		int b = 1;
		int c;
		
		
		for (int i = 0; i <10; i++) {
			                           //step 1
		System.out.print(a+"  ");      // op =0
		
                                      // c =1
		c=a+b;                        // a=1
		a=b;                          // b=1
		b=c;                          // i=1
		
		                               //step 2
		}                              //i=2
		                               //op=2
	}                                  //c=2
                                       //a=1
}                                      //b=2
                                       //i=2