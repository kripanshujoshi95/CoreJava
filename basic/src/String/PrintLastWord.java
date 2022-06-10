package String;

public class PrintLastWord {
	public static void main(String[] args) {
		
		// print only last word//
		
		String s = "navneet veer kumar gohe";
		String []a= s.split(" ");
		String l = a[a.length-1];  //-1 ki jgh -2 likhe to print kumar hoga
		System.out.println(l);     //-1 ki jgh -3 likhe to print veer hoga
	}                              //-1 ki jgh -4 likhe to print navneet hoga

}
