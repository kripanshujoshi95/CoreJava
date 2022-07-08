package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		m.put(6, "six");
		m.put(10, "ten");
		
		
		System.out.println(m);
		//m.clear();
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("three"));
		System.out.println(m.entrySet());
		System.out.println(m.get(6));
		System.out.println(m.remove(2));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.keySet());
		System.out.println(m.values());
	
		
	
}
}