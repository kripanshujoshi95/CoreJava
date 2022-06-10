package Exercise4_14_First;

public class Ecercise10_Armstrong {
	
	public static void main(String[] args) {
		 // 1 ka cube + 5 ka cube + 3 ka cube =153
		int n=153,r,sum=0,p=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		//System.out.println(sum);
		if(sum==p) {
			System.out.println(sum +" Armstrong");
		}else {
			System.out.println("not Armstrong");
		}
		
	}

}
