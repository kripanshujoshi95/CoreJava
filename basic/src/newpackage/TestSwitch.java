package newpackage;

public class TestSwitch {
	public static void main(String[] args) {
		
		int size= args.length;
		
		switch (size) {
		case 0  : System.out.println("hello");
			
			break;
			case 1: System.out.println(args[0]);
			break;
			case 2: System.out.println(args[1]);
			break;

		default:
			for(int i=0; i<size; i++) {
			System.out.println(args[i]);}
		
		}
		
		
	}

}
