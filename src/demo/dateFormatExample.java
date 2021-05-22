package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class dateFormatExample {
	public void main(String k[]) {
		Date today= new Date();
	    System.out.println(today);
	    SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
	    SimpleDateFormat m_sdf= new SimpleDateFormat("dd-MMM-yyyy EEEE");
	    System.out.println(  sdf.format(today));
	    String someDate="01-03-2021";
	    try {
	        Date oldDate=sdf.parse(someDate);
	        System.out.println(m_sdf.format(oldDate));    
	        System.out.println(" oldDate is before today "+oldDate.before(today));
	        System.out.println(" today is after oldDate "+today.after(oldDate));
	    } catch (ParseException e) {
	        
	        e.printStackTrace();
	    }       
	       long totalTime =today.getTime()+24*60*60*1000;
	       Date tomorrow= new Date(totalTime);
	       System.out.println("Tomorrow is "+m_sdf.format(tomorrow));
	}

}
