package Thread;

public class withThread extends Thread {
	
	
	String name=null;
	
	
	public withThread(String ThreadName) {
		name=ThreadName;
		
	}

	
	@Override
	public void run() {
		
		for(int i=0; i<50; i++) {
			System.out.println(i +" hello thread " + name);
		}
		
	}
	
	public static void main(String[] args) {
		
		withThread t= new withThread("raina");
		withThread t1 = new withThread("virat");
		
		t.start();
		t1.start();
		
		
		
	}
}
