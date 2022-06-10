package Exercise4_14_First;

public class Exercise8_2DArray {
	public static void main(String[] args) {
		
		int [][]table= new int[10][10];
		int c=1;
		
		for(int i=0;i<table.length;i++) {
			for(int j=2;j<=table[i].length;j++) {
				c=(i+1)*(j);
				System.out.print(c+"\t");
			}
			System.out.println();
	}

	}
}
