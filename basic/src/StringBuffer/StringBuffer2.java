package StringBuffer;

public class StringBuffer2 {
public static void main(String[] args) {
	
	StringBuffer i= new StringBuffer("sourabh");
     i.append("gokhale");
	
	System.out.println(i.length());
	System.out.println(i.capacity());
	System.out.println(i.charAt(2));
	System.out.println(i.indexOf("rabh"));
	System.out.println(i.replace(0, 5, "jay"));
	System.out.println(i.reverse());
	
}

}
