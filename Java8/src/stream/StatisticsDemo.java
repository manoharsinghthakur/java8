package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsDemo {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,4,3,5,3,6);
		
		IntSummaryStatistics st=number.stream().mapToInt(x->x).summaryStatistics();
		IntSummaryStatistics other=number.stream().filter(x->x>3).mapToInt(x->x).summaryStatistics();
		
		System.out.println(st);
		System.out.println(st.getCount());
		System.out.println(st.getAverage());
		System.out.println(st.getMax());
		
		System.out.println("----------");
		st.combine(other);
		System.out.println(st);
	
		 
		
	}

}
