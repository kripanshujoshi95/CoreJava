package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormat {
	public static void main(String[] args) throws ParseException {
	
	Date d = new Date() ;
	System.out.println(d);
	
	System.out.println("-------date format-----------");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	String s = sdf.format(d);
	System.out.println(s);
	
	System.out.println("---------parsing-------");
	String s1 = "3/07/1997";
	Date d1 = sdf.parse(s1);
	System.out.println(d1);
	
	
	
	
}
	
}	
		
		
		
		
		
		
	


