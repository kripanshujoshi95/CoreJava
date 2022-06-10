package Exercise4_14_First;

import java.util.Arrays;

public class Exercise15_LargestNumberOfArray {
	public static void main(String[] args) {
		
	int arr[] = {12,25,65,98,15,455,722,800,540,76,48};
	
	int max = arr[0];
	for(int i=0; i<arr.length; i++) {
	if(arr[i]>max) {
		max = arr[i];
	}	
		
	}
	System.out.println(max);
	
	
	
	

	
	

	/**public static int getLargest(int[] a, int total){  
			Arrays.sort(a);  
			return a[total-1];  
			}  
		
			public static void main(String args[]){  
			int a[]={1,2,5,6,3,2};  
			System.out.println("Largest: "+getLargest(a,6));  
			 
			}**/
}
}