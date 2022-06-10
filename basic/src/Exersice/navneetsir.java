package Exersice;

public class navneetsir {

	public static void main(String[] args) {
		String h = "mayank";
		int k = 0;

		for (char a = 'a'; a <= 'z'; a++) {
			for (int b = 0; b < h.length(); b++) {

				if (h.charAt(b) == a) {
					k++;
				}
			}
			if (k != 0)
				System.out.println(a + "=" + k);
			k = 0;
		}
	}
}
