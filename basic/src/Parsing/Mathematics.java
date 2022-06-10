package Parsing;

public class Mathematics {
	public static void main(String[] args) {
		System.out.println("---------integer------");
		String a = "100";
		String b = "50";
		
		int i =Integer.parseInt(a);
		int m =Integer.parseInt(b);
		

		int c= i+m;
		System.out.println(c);
		
		System.out.println("---------float--------");
		
		String q ="97";
		String w ="54";
		
		Float f =Float.parseFloat(q);
		Float g =Float.parseFloat(w);
		
		float h = f-g;
		System.out.println(h);
		
		System.out.println("---------double------");
		
		String dd= "55";
		String df= "2";
		
		Double as= Double.parseDouble(dd);
		Double ak= Double.parseDouble(df);
		Double lk= as*ak;
		System.out.println(lk + " Result ");
		
		
		
	}

}
