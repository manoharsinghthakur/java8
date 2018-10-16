package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
//java 7

  /*public class CurrentDate {
	public static void main(String[] args) {
		
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date date=new Date();
		System.out.println(date);
		System.out.println(df.format(date));
		
	} 
}*/

// java 8

public class CurrentDate{
	public static void main(String[] args) {
		LocalDateTime currDateTime=LocalDateTime.now();
		System.out.println(currDateTime);
		System.out.println(currDateTime.toLocalDate().getMonthValue()+"..."+currDateTime.toLocalTime());
	}
}

