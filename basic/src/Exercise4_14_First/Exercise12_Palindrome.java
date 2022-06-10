package Exercise4_14_First;

public class Exercise12_Palindrome {
	
	//palindome no. is a number which remains same when its is reversed. example(121,1441,75257)
	
	public static void main(String[] args) {
	int rev=0,rem=0,num=121 ,org=num;
		
		while(num!=0) {
			
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}
		
		if(org==rev) {
			System.out.println("Number is Pallindrome");
		}else {
			System.out.println("Number is not Pallindrome");

		}
		
		
		
		
		
		
		
	}

}
