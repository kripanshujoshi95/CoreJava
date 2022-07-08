package Exception;

public class MultipleCatchBlocks {

	/**
	 * more than one exception could be raised by a single try block. To handle this
	 * situation, you specify two or more CATCH blocks.
	 **/

	public static void main(String[] args) {

		String name = "vijay";
		

		try {
			System.out.println("lenthn of name is " + name.length());
			System.out.println("character at 7th position " + name.charAt(6)); // string index out of bound exception

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String choti h");
		//	System.exit(0);    // for stoping finnay we use this command
		}

		catch (NullPointerException n) {
			System.out.println("naam likha hua h");
		
		} finally {
			System.out.println("yee to print hoga hi");

		}

	}

}
