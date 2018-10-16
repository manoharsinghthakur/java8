package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LimitDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,6,4,5,8,7,9);
		list.stream().sorted().limit(4).forEach(System.out::println);
		
		List filter=list.stream().filter(x-> x>5).collect(Collectors.toList());
		System.out.println("filter is "+filter);
		
		
		Random random=new Random();
		//random.nextInt('a');
		/*random.nextInt('b');
		random.nextInt('c');
		*//////need to know random
		random.ints().limit(4).forEach(System.out::println);
		 
	}
}
