package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class ZonedDateTimeTest {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.parse("2008-03-12T10:25:33+05:30[Asia/Kolkata]");
		System.out.println(dateTime);
		
		ZoneId id=ZoneId.of("Europe/Paris");
		System.out.println(id);
		
		ZoneId zid=ZoneId.systemDefault();
		System.out.println("Current zone "+zid);
	}

}
 