package Thread;

public class WithoutThread {
	
	String name=null;
	
	public WithoutThread(String threadName) {
		name=threadName;
		
	}
	
	
	public void run() {
		
		for(int i=0; i<50; i++ ) {
			System.out.println(i+" hello thread "+name);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		WithoutThread wt= new WithoutThread("raina");
		
		WithoutThread wt1= new WithoutThread("virat");
		
		wt.run();
		wt1.run();
		
		
	}

}
