 package Exercise9_7;

public class ImmutableClass1 {
	public static void main(String[] args) {
		
		ImmutableClass i = new ImmutableClass("kripanshu", 12);           
		System.out.println(i);		
		
		
	}

}
  /** ImmutableClass me toString method se override ki h to direct object(i) se call ho jaayega
   
     @Override
    public String toString() {
	return "ImmutableClass [name=" + name + ", RollNO=" + RollNO + "]";

     isi format me print hoga**/
