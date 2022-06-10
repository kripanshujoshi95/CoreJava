package Exercise6_4STRING;

public class Ex_2ExtractLastName {
	public static void main(String[] args) {
		
		//by substring method
		String name = "Vijay Chouhan";
		System.out.println(name.substring(6));
		
		
		
		//by for each loop
		String s = "Vijay Chouhan";
		String[]a = s.split(" ");
		String b = a[a.length-1];
		System.out.println(b);
		
		
		
		
		
		
		
		
	}

}
