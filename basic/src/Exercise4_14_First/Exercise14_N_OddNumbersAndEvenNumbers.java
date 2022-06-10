package Exercise4_14_First;

public class Exercise14_N_OddNumbersAndEvenNumbers {
	public static void main(String[] args) {
		
		int sum1=0,sum2=0;
		float f;
		for(int i=0; i<=5; i++) {
			if(i%2 == 0) 
			{
				sum1 = sum1+i;
			}
			else if(i%2 != 0)
			{
				sum2 = sum2+i;
			}
		}System.out.println("sum of N consecutive even number is : "+sum1+" and sum of N consecutive odd numbers is : "+sum2);
		f = (sum1+sum2)/2f;
		System.out.println("average of consecutive N odd and even number is : "+ f);
	}
		
		
		
		
		
	}


