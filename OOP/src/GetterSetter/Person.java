package GetterSetter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	private String name = null;
	private Date Date;
	private String address=null;
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY");
	  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


    public String  getDate() {
		String s1 = s.format(Date);
		return s1;
	}

	public void setDob(String s2) throws ParseException {
		Date = s.parse(s2);
	}
	}

