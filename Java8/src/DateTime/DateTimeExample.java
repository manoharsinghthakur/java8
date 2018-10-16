package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld=ldt.toLocalDate();
		System.out.println(ld);
		
		Month month=ldt.getMonth();
		System.out.println(month);
		
		int day=ldt.getDayOfMonth();
		System.out.println(day);
		 
		int second=ldt.getSecond();
		System.out.println(second);
		
		LocalTime lt=ldt.toLocalTime();
		System.out.println(lt);
		
		LocalDateTime ldtSomeDate=ldt.withDayOfMonth(11);
		System.out.println(ldtSomeDate);
		
		
		LocalTime ltTime=LocalTime.of(11, 40);
		System.out.println(ltTime);
		
		LocalTime ltnano=LocalTime.ofNanoOfDay(2100422222);
		System.out.println(ltnano);
	}
}
