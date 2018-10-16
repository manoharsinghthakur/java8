package stream;

import java.util.Arrays;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List l=Arrays.asList(1,5,4,6,5);
		l.stream().sorted().forEach(System.out::println);
	}

}
 