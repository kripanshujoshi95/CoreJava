package Methodoverloding;

//same class
//same name
//different arguments


public class Print {
	
	void print (boolean b) {
		System.out.println("true");
		
		}
	
	void print (String s, int r ){
		System.out.println("name");
	    }
    
	void print (char c) {
		System.out.println("character");
	    }


       void print (float f) {
    	   System.out.println("point value");
    	   
        }
       
       void print (int i ){
	   System.out.println("integer value");
        }
       
       void print (int x , String n , float l) {
    	   System.out.println("argument different");
       }


public static void main(String[] args) {
	
	Print p = new Print();
	p.print(10);
	
	p.print('k');
	
	p.print(20.9f);
	
	p.print("kripanshu" , 100);
	
	p.print(200, "pamshu", 30.15f);
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
