package stream;

import java.util.stream.Stream;

public class MapToObject {
	public static void main(String[] args) {
		Stream s="abc".chars().mapToObj(x->(char)x);
		s.forEach(System.out::println);
	}
}
 