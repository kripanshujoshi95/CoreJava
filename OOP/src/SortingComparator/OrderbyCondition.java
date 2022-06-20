
package SortingComparator;

import java.util.Comparator;

public class OrderbyCondition implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		if(m1.getFname().equals(m2.getFname())) {
			return m1.getLname().compareTo(m2.getLname());
			
		}else {
			return m1.getFname().compareTo(m2.getFname());
		
		}
	}

}
