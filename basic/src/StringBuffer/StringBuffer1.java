package StringBuffer;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer a =new StringBuffer("ramesh");
		a.append("kumar verma");
		
 System.out.println("length " + a.length());
 System.out.println("capacity " + a.capacity());//capacity 16 fix rehti h uske baad jitne word h usko count krke btata h//
 System.out.println("char at " + a.charAt(1));
 System.out.println("indexOf " + a.indexOf("kumar"));
 System.out.println("replace " + a.replace(2,7,"jay"));
 System.out.println("reverse " + a.reverse());
 
 
	}

}
