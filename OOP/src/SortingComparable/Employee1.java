package SortingComparable;

public class Employee1 implements Comparable<Employee1>{
	
	int id;
	String name;
	String salary;
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public Employee1(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getSalary() {
		return salary;
	}


	@Override
	public int compareTo(Employee1 e) {
		if(getId()==e.getId()) {
		return 0;
		}
		if (getId()>e.getId()) {
			return 1;
		}else {
		
			return-1;
		}
	
	

	
	
	
	
	
	}		
}

