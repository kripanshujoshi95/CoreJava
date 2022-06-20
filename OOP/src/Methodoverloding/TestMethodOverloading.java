package Methodoverloding;

public class TestMethodOverloading {
	
		
		
		 void Show(int a,int b) {
			System.out.println("rays ");
		}
		 
		 void Show(int a) {
			 System.out.println("name");
		 } 
			 
		void Show (String s , int a) {
			System.out.println("address");
		}
		
		void Show (int a , String s) {
			System.out.println("color");
		}
		
		void Show (float f , String r , int d) {
			System.out.println("sun");
		}
			 
		public static void main(String[] args) { 
			
			TestMethodOverloading t = new TestMethodOverloading();
			t.Show(10);
			t.Show("java" , 50);
			t.Show(15 , 60);
			t.Show(25.5f , "core" , 12);
			t.Show(150 , "good");
		}
		
		
		
	
	
	

	}
	