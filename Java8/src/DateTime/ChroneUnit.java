package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
// java7
/*
public class ChroneUnit {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		Calendar calendar=Calendar.getInstance();
		//System.out.println(calendar);
		calendar.setTime(date);
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH,+1);
		System.out.println(calendar.getTime());
		
	}
} 
*/

// java 8

public class ChroneUnit {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		LocalDate nextMonth =today.plus(1,ChronoUnit.MONTHS);
		System.out.println(nextMonth);
		
		LocalDate nextYear=today.plus(1,ChronoUnit.YEARS);
		System.out.println(nextYear);
		
		LocalDate nextCentury=today.plus(1,ChronoUnit.CENTURIES);
		System.out.println(nextCentury);
						System.out.println(today.with(nextYear).compareTo(nextMonth));
	}
}
