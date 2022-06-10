package ValueOf;
// premiditive data types ko string me change krne 
//   k liye valueOf ka use krte h

public class TestValueOf {public static void main(String[] args) {
	int a = 25;
	int b = 50;
	int c = b-a;
	String s= "rohan";
	
	System.out.println(c);
	String t = s.valueOf(c);
	
	
	String m ="rays";
	float j = 2.5f;
	float k = 3.2f;
	float l = j+k;
	
	
	System.out.println(l);
	String n = m.valueOf(l);
	
	
	
	
}

}
