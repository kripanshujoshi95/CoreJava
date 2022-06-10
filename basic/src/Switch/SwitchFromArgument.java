package Switch;

public class SwitchFromArgument {
	public static void main(String[] args) {
		int size = args.length;
		switch(size) {
		
		case 0 :
			System.out.println("hello all");
			break;
			
		case 1 :
			System.out.println("core "+ args[0]);
			break;
			
		default :
			for (int i = 0; i < size; i++) {
				System.out.println(i + "=hello "+ args[1]);
				
			}
		}
	}

}
