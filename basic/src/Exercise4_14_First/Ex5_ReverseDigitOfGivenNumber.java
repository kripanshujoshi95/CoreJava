package Exercise4_14_First;

public class Ex5_ReverseDigitOfGivenNumber {
	
	public static void main(String[] args) {
		
		int no = 5432 , rem=0,rev=0;
		
		while(no!=0) {
			
			rem= no%10;       // 5432/10= 2
			rev= rev*10+rem;  // 0*10+2 =2 
			no= no/10;        //
			
			
		}
			System.out.println(rev);
			
		}
		
		
		
		
	

}
