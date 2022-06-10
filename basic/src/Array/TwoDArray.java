package Array;

public class TwoDArray {
	public static void main(String[] args) {
		
		int [] []t = new int[4] [2];
		t[0][0]=2;
		t[1][0]=3;
		t[2][0]=4;
		t[3][0]=5;
		//t[4][0]=7;
		
		t[0][1]=7;
		t[0][1]=8;
		t[0][1]=9;
		t[0][1]=6;
		//t[4][1]=3;
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length ; j++) {
				System.out.println(t[i][j]);
				
		}
			System.out.println();
		}
			
		}



		

}
