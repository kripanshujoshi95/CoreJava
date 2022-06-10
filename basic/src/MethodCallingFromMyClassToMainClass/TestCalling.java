package MethodCallingFromMyClassToMainClass;

public class TestCalling {
	
 public void add () {
	int a = 25;
	int b = 25;
	int c = a+b;
	
	System.out.println(c);
	
    }

 public void sub () {
	 int d = 10;
	 int e = 5;
	 int f = d-e;
	 System.out.println(f);
 }
 
public void mul() {
	int w = 12;
	int r = 5;
	int t = w*r;
	System.out.println(t);
}

public static void divison () {
	int l = 625;
	int m = 5;
	int n = l/m;
	System.out.println(n);
}




public static void addition() {          //static lgayenge to main class me direct TestCalling.addition
	                                      //naam se call kr lenge//
	int bc =200;
	int cd =200;
	int de =bc+cd;
	System.out.println(de);
}

public static void sum(){
	int a = 98;
	int b = 2;
	int c =a+b;
	System.out.println(c);
}

}


