package String;

public class ReverseCount {
public static void main(String[] args) {
	String s = "welcome to rays";
	String [] a = s.split(" ");
	for(String w : a) {
		for(int i = w.length()-1; i>=0; i--) {
			System.out.print(w.charAt(i));
		}System.out.print(" ");
	}
	
}

}
