package javabasic;

public class teatargument {
	public static void main(String[] args) {
		
	int size =Integer.parseInt( args[0]);
	if (args[0]==null) {
		
		System.out.println("size is required");
	}else {
		for (int i = 1; i <= size; i++) {
	
			System.out.println(i+" hello");
		}
		
		
		
	}
	
}

}
