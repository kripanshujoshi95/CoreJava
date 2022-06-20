package Exercise9_7;

public class TestBussinessman {
	
	public static void main(String[] args) {
		
		Bussinessman b = new Bussinessman("kripanshu", "khargone");
	    System.out.println(b.getName());
	    System.out.println(b.getAddress());
		
		/**	b.donation();
	        b.party();
			b.ReadingBooks();
			b.EatingPizza();**/
			
		
		Richman r = new Bussinessman();
		r.donation();
		r.party();
		
		Student s =new Bussinessman();
		s.ReadingBooks();
		s.EatingPizza();
	
		}

}
