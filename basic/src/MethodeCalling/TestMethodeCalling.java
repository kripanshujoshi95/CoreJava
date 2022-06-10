package MethodeCalling;

public class TestMethodeCalling {
	public static void main(String[] args) {
		String a=add();
		System.out.println(a);
		
	int e=sub();
		System.out.println(e);
		
	int p =mul();
	System.out.println(p);
	
	int x =div();
	System.out.println(x);
	
	}
	
  public static String add(){
	  String s = "ram ";
	  String s1 = "shyam";
	  String s3 = s+s1;
	  return s3;
	}
  
  public static int sub(){
	  int x=677;
	  int y=342;
	  int z=x-y;
	return z;
	
	}
  
  public static int mul() {
	  int u =20;
	  int v =10;
	  int h =u*v;
	  return h;
  }
  
  public static int div() {
	  int c =150;
	  int d =15;
	  int e = c/d;
	  return e;
  }
  
  
  }
  
  
  

