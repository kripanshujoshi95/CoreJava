package Array;

public class CopyArray {
	public static void main(String[] args) {
		char[] copyFrom = {'a','s','d','f','g','y','i','r','e'};
		char[] copyTo = new char[10];
		System.arraycopy(copyFrom, 1, copyTo, 2, 5
				);
		// its only depand on length

		System.out.print(new String(copyTo));

	}

}
