package stream;

import java.util.Arrays;
import java.util.List;

public class FilterOperation {
	public static void main(String[] args) {
		List l = Arrays.asList(1, 5,6, 3, 2);
		l.stream().filter(x-> (int)x%2==0).forEach(System.out::println);
	}
}
