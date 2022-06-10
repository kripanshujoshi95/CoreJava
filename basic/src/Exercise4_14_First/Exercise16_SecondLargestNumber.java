package Exercise4_14_First;

public class Exercise16_SecondLargestNumber {
	public static void main(String[] args) {
		
		int arr[] = {12,23,21,34,44,345,765,87};
		int max = arr[0];
		int sec_max = arr[1];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				sec_max= max;
				max = arr[i];
			}else if(arr[i]> sec_max && arr[i] != max) {
				sec_max= arr[i];
			}
			
		}
		
		System.out.println(sec_max);
		
		
		
		
	}
		
}	
		
		
		
		
		
		
		
		
	
	

