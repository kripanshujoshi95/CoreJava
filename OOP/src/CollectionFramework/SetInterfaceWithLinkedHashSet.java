package CollectionFramework;

import java.util.LinkedHashSet;

public class SetInterfaceWithLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet k = new LinkedHashSet();
		
		k.add(2);
		k.add(28);
		k.add(42);
		k.add(10);        // print same as insertion order
		k.add(186);
		k.add(74);
		k.add(20);
		k.add(50);
		
		
		System.out.println(k);
	}

}
