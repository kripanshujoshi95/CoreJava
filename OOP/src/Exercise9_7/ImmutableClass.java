package Exercise9_7;

public final class ImmutableClass {
	
	private final String name;
	private final int RollNO;

	//make class as final
	//make fields as final
	//make variable as final
	//no setter method
	
	
	public ImmutableClass(String name, int rollNO) {
	
		this.name = name;
		RollNO = rollNO;
	}

	public String getName() {
		return name;
	}

	public int getRollNO() {
		return RollNO;
	}

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", RollNO=" + RollNO + "]";
	}

	}

	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

