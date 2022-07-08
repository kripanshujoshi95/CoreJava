package CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

public class InstantiateV_AL_HT_HM {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10);
		v.add(10);                      //capacity predefined = 10 ,if size is 0 then capacity will also 10
		v.add(10);                      // then we extend size to 11 then capacity will be double =20
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(102);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(150);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(150);
		v.add(10);
		v.add(10);
		v.add(25);
		v.add(894);
		
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		
		System.out.println("----------ArrayList--------");
		ArrayList al = new ArrayList();
		
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(4);
		
System.out.println(al.size());


		
		
	}

}
