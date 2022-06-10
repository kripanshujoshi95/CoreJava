package Exercise6_4STRING;

public class Ex_3CountOccurrence {
	public static void main(String[] args) {
		int r=0;
		
		String s = "Vijay Dinanath Chohan";
		
		for(int i=0 ; i<s.length(); i++) {
			for (int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)){
					r++;
				}
			}
			System.out.println(s.charAt(i)+"="+r);
			r=0;
		}
		
	}

}
