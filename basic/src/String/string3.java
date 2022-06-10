package String;

public class string3 {
	public static void main (String []args) {
	
		String p = "Ravindra Joshi";
		
		System.out.println("String Length " + p.length());
		System.out.println("7th character is " + p.charAt(6));		
		System.out.println("vina index is " + p.indexOf ("vin"));
		System.out.println("first a position " + p.indexOf ("a"));
		System.out.println("last a position " + p.lastIndexOf("a"));
		System.out.println("i is replaced by u " + p.replace("i", "u"));
		System.out.println("all a is replaced by t " + p.replaceAll("a","t"));
		System.out.println("chota Ravindra " + p.toLowerCase());
		System.out.println("Bada Ravindra " + p.toUpperCase() );
		System.out.println("starts with kri " + p.startsWith("kri"));
		System.out.println("ends with hi " + p.endsWith("hi"));
		System.out.println("substring " +p.substring(3) );
		
		
		
	}

}
