package String;

public class ReverseCount2 {
	public static void main (String[] args) {
		
		String s = "i am going";
		String []a = s.split(" ");
		for(String b : a) {
			for(int i=b.length()-1; i>=0; i--)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print(" ");
		}
		
		
	}
}
