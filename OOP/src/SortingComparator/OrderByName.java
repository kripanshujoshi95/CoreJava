package SortingComparator;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
	
		return m1.getFname().compareTo(m2.lname);
	}

	

}
