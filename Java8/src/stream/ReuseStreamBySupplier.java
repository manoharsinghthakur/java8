package stream;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReuseStreamBySupplier {

	public static void main(String[] args) {
		String[] arr={"as","dd","gg"};
		
		/*Stream s=Arrays.stream(arr);
		s.forEach(System.out::print);
		s.filter(x->x.equals("dd")).forEach(System.out::print);*/
		
		Supplier<Stream<String>> s=() -> Stream.of(arr);
		s.get().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println();
		s.get().filter(x->x.equals("dd")).forEach(System.out::print);
	}

} 
