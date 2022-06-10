package String;

public class ReverseCount1 {
	public static void main(String[] args) {
		
		//anuj apni aur joshi apni jgh pr reverse ho//
		
		String s = "Anuj Joshi";
		String[]a = s.split(" ");
		 for (String w: a) {
			 for (int i = w.length()-1; i>=0; i--) {
				 System.out.print(w.charAt(i));
				
			}System.out.print(" ");
			
		}
		 
		 System.out.println();  //new line me curser ko laane k liye//
		 
		 
		 //ravindra apni hi aur joshi bhi apni jgh pr reverse ho jaaye//
		 String t = "ravindra joshi";
		 String[]r= t.split(" ");
		 for (String u : r) {
			 for(int y= u.length()-1; y>=0; y--) {
				 System.out.print(u.charAt(y));
			 }
			 System.out.print(" ");
		 }
		 
		 
		 
		 
		 //name aur surname aapas me bhi reverse honge//
		 
		 String name = "shailendra joshi";
		 
		 System.out.println();    //curser ko new line me laane k liye//
		 
		 for(int b = name.length()-1; b>=0; b--) {
			 
		  System.out.print(name.charAt(b));
				 
		 }
		 
		 
		 
		 
		 
		 
				
	}
}
